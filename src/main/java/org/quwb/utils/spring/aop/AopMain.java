package org.quwb.utils.spring.aop;

import org.quwb.utils.spring.aop.inter.IStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author quwb
 * @create 2018-06-21 15:25
 * @desc
 **/
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resources/spring/aop/aopbean.xml");
        IStudent person = (IStudent)ctx.getBean("student");
        person.addStudent("屈文斌1");
    }
}
