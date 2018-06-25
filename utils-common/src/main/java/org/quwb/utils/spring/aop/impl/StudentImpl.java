package org.quwb.utils.spring.aop.impl;

import org.quwb.utils.spring.aop.inter.IStudent;

/**
 * @author quwb
 * @create 2018-06-21 15:10
 * @desc
 **/
public class StudentImpl implements IStudent {
    @Override
    public void addStudent(String name) {
        System.out.println(name);
    }
}
