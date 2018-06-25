package org.quwb.utils.spring.container.domain;


/**
 * @author quwb
 * @create 2018-06-21 7:42
 * @desc
 **/
public class Programer {
    public Programer(People people) {
        System.out.println(people.getName());
    }

    public void show(String args) {
        System.out.println(String.format("输入参数：%s", args));
    }
}
