/*
 * @(#)BasicThreadTest.java      2018/8/14
 *
 * 百得利集团拥有完全的版权
 * 使用者必须经过许可
 */
package org.quwb.utils.jvms;

/**
 * 功能：
 *
 * @author twfx7
 * @since JDK 1.8
 */
public class BasicThreadTest extends Thread {

    public static void main(String[] args) {

        BasicThreadTest b1 = new BasicThreadTest("Thread a");
        BasicThreadTest b2 = new BasicThreadTest("Thread b");

        b1.setName("BasicThreadTest-1");
        b2.setName("BasicThreadTest-2");

        b1.start();
        b2.start();
    }

    public BasicThreadTest(String name) {

    }

    @Override
    public void run() {
        while (true) {

        }
    }

}
