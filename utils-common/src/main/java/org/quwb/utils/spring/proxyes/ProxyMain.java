package org.quwb.utils.spring.proxyes;

import org.quwb.utils.spring.proxyes.impl.HelloImpl;
import org.quwb.utils.spring.proxyes.impl.ProxyHandler;
import org.quwb.utils.spring.proxyes.inter.Hello;

import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        Hello proxy = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, new ProxyHandler(hello));
        proxy.doSomething();
    }
}
