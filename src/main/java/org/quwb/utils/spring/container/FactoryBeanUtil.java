package org.quwb.utils.spring.container;

import org.quwb.utils.spring.container.domain.MyFactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Date;

/**
 * @author quwb
 * @create 2018-06-21 16:03
 * @desc
 **/
public class FactoryBeanUtil {
    public static void main(String[] args){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        Resource resource = new ClassPathResource("/spring/container/applicationcontext.xml");
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        //这里获取的其实是自定义FactoryBean中getObject获取到的Value
        Date now = (Date) beanFactory.getBean("myFactoryBean");
        System.out.println(now);
        //这里获取的是FactoryBean
        MyFactoryBean factoryBean = (MyFactoryBean) beanFactory.getBean("&myFactoryBean");
        factoryBean.sayName();
    }
}
