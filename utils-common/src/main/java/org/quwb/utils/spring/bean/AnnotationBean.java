/*
 * @(#)AnnotationBean.java      2018/8/17
 *
 * 百得利集团拥有完全的版权
 * 使用者必须经过许可
 */
package org.quwb.utils.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 功能：
 *
 * @author twfx7
 * @since JDK 1.8
 */
@Component
public class AnnotationBean {
    @PostConstruct
    public void start(){
        System.out.println("AnnotationBean start");
    }

    @PreDestroy
    public void destory(){
        System.out.println("AnnotationBean destory");
    }
}
