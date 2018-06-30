package org.quwb.utils.spring.aop;

import org.aopalliance.aop.Advice;
import org.quwb.utils.spring.aop.advice.TickServiceThrowsAdvice;
import org.quwb.utils.spring.aop.advice.TicketServiceAfterReturningAdvice;
import org.quwb.utils.spring.aop.advice.TicketServiceAroundAdvice;
import org.quwb.utils.spring.aop.advice.TicketServiceBeforeAdvice;
import org.quwb.utils.spring.aop.impl.RailwayStation;
import org.quwb.utils.spring.aop.inter.TicketService;
import org.springframework.aop.framework.ProxyFactoryBean;

public class ProxyMain {
    public static void main(String[] args){
        //1.针对不同的时期类型，提供不同的Advice
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterReturningAdvice = new TicketServiceAfterReturningAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();
        Advice throwsAdvice = new TickServiceThrowsAdvice();

        RailwayStation railwayStation = new RailwayStation();
        //2.创建ProxyFactoryBean，用以创建指定对象的proxy对象
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        //3.设置proxy的接口
        proxyFactoryBean.setInterfaces(TicketService.class);
        //4.设置RealSubject
        proxyFactoryBean.setTarget(railwayStation);
        //5.使用JDK基于接口实现机制的动态代理生成Proxy代理对象，如果想使用CGLIB，需要将这个flag设置成true
        proxyFactoryBean.setProxyTargetClass(true);
        //6. 添加不同的Advice
        proxyFactoryBean.addAdvice(afterReturningAdvice);
        proxyFactoryBean.addAdvice(aroundAdvice);
        proxyFactoryBean.addAdvice(throwsAdvice);
        proxyFactoryBean.addAdvice(beforeAdvice);
        proxyFactoryBean.setProxyTargetClass(false);
        //7.通过proxyFactoryBean生成proxy对象
        TicketService ticketService = (TicketService)proxyFactoryBean.getObject();
        ticketService.sellTicket();
    }
}
