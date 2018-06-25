package org.quwb.utils.spring.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author quwb
 * @create 2018-06-21 15:02
 * @desc
 **/
public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("这个是BeforeAdvice的before方法");
    }
}
