package org.quwb.utils.spring.container.domain;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Date;

/**
 * @author quwb
 * @create 2018-06-21 15:41
 * @desc
 * Spring中的FactoryBean怎么理解：
   Spring中有两种类型的Bean：一种是普通的javaBean；
   另一种就是工厂Bean（FactoryBean),
   这两种Bean对IOC容器BeanFactory来说在获取Bean的方式上有一些细微的差别
 **/
public class MyFactoryBean implements FactoryBean<Date>, BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    @Override
    public Date getObject() throws Exception {
        return new Date();
    }

    @Override
    public Class<?> getObjectType() {
        return Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void sayName(){
        System.out.println("My name is "+this.name);
    }
}
