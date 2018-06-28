package org.quwb.utils.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;

    public void published() {
        DemoEvent demoEvent = new DemoEvent(this, "发布消息成功");
        System.out.println("发布event：" + demoEvent);
        context.publishEvent(demoEvent);
    }
}
