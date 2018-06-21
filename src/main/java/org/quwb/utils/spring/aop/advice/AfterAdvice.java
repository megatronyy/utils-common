package org.quwb.utils.spring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author quwb
 * @create 2018-06-21 15:00
 * @desc
 **/
public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("这个是afterReturning方法！");
    }
}
