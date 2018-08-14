package org.quwb.utils.base;

import sun.misc.Unsafe;

public class BootStrap {
    public static void main(String[] args) {
        String name = "quwb";
        greeting(name);
        Thread.dumpStack();

        Unsafe unsafe = Unsafe.getUnsafe();
    }

    public static void greeting(String name) {
        System.out.println("Hello," + name);
    }
}
