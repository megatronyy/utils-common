package org.quwb.utils.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.quwb.utils.spring.event")
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventMain.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.published();
        context.close();
    }
}
