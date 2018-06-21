package org.quwb.utils.container;

import org.quwb.utils.container.domain.Programer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author quwb
 * @create 2018-06-21 7:26
 * @desc XML相关spring的容器
 **/
public class XmlUtil {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("container/applicationcontext.xml");
        Programer programer = context.getBean(Programer.class);
        programer.show("屈文斌是最棒的");
    }
}
