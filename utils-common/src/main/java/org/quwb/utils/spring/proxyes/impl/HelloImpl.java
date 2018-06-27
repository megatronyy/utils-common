package org.quwb.utils.spring.proxyes.impl;

import org.quwb.utils.spring.proxyes.inter.Hello;

public class HelloImpl implements Hello {
    @Override
    public void doSomething() {
        System.out.println("HelloImpl doSomething");
    }
}
