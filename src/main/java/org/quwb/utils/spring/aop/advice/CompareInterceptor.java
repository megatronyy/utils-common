package org.quwb.utils.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author quwb
 * @create 2018-06-21 15:06
 * @desc
 **/
public class CompareInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object result = null;
        String stu_name = invocation.getArguments()[0].toString();
        if (stu_name.equals("dragon")) {
            //如果学生是dragon时,执行目标方法,
            result = invocation.proceed();
        } else {
            System.out.println("此学生是" + stu_name + "而不是dragon,不批准其加入.");
        }
        return result;
    }
}