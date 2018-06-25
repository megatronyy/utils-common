package org.quwb.utils.spring.container;

import org.quwb.utils.spring.container.domain.Programer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author quwb
 * @create 2018-06-21 7:26
 * @desc XML相关spring的容器
 **/
public class XmlUtil {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/container/applicationcontext.xml");
        Programer programer = context.getBean(Programer.class);
        programer.show("屈文斌是最棒的1");

        ClassPathResource res = new ClassPathResource("spring/container/applicationcontext.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        Programer programer2 = factory.getBean(Programer.class);
        programer2.show("屈文斌是最棒的2");
    }
}
