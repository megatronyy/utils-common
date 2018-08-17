/*
 * @(#)BeanStartApplication.java      2018/8/17
 *
 * 百得利集团拥有完全的版权
 * 使用者必须经过许可
 */
package org.quwb.utils.spring.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 *
 * @author twfx7
 * @since JDK 1.8
 */
public class BeanStartApplication {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Object bean = ctx.getBean("AnnotationBean");
        if(bean != null){

        }
    }
}
