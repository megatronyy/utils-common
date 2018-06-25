package org.quwb.utils.threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* *
   * 第一种synchronized方式死锁;
* */
public class SyncDeadLock {
    private static Object locka = new Object();
    private static Object lockb = new Object();

    private void deadLock() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (locka) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get locka ing!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " need lockb!Just waiting!");

                    synchronized (lockb) {
                        System.out.println(Thread.currentThread().getName() + " get lockb ing!");
                    }
                }
            }
        }, "thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockb) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get locka ing!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " need lockb!Just waiting!");

                    synchronized (locka) {
                        System.out.println(Thread.currentThread().getName() + " get lockb ing!");
                    }
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        //Lock
        //ReentrantLock
        //ReentrantReadWriteLock
        new SyncDeadLock().deadLock();
    }
}
