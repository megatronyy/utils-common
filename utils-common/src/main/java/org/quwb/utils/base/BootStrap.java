package org.quwb.utils.base;

public class BootStrap {
    public static void main(String[] args) {
        String name = "quwb";
        greeting(name);
        Thread.dumpStack();
    }

    public static void greeting(String name) {
        System.out.println("Hello," + name);
    }
}
