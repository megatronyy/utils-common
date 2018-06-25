package org.quwb.utils.base;

import java.util.concurrent.locks.*;

/**
 * @author quwb
 * @create 2018-06-11 9:44
 * @desc 在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。
 * 如果使用 static 修饰初始化块，就称为静态初始化块。  需要特别注意：静态初始化块只在类加载时执行，
 * 且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量
 **/
public class InitBlock {
    int num1;
    int num2;
    static int num3;

    public InitBlock() {
        num1 = 91;
        System.out.println("通过构造方法为变量num1赋值");
    }

    //初始化块
    {
        synchronized (this){
            num2 = 74;
        }

        System.out.println("通过初始化块为变量num2赋值");
    }

    static {
        num3 = 83;
        System.out.println("通过静态初始化块为静态变量num3赋值");
    }

    public static void main(String[] args) {
        InitBlock init = new InitBlock();
        System.out.println("num1" + init.num1);
        System.out.println("num2" + init.num2);
        System.out.println("num3" + num3);
        InitBlock init2 = new InitBlock();
        int a = 10;

        ReentrantLock lock  = new ReentrantLock();
        lock.lock();
        lock.unlock();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock lock2 = readWriteLock.readLock();
        lock2.lock();

        StampedLock lock3 = new StampedLock();
        lock3.writeLock();

    }
}
