package com.eyre.spring.mybatis.spring.listener;

import com.eyre.spring.mybatis.spring.event.TestEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/5/20.
 */
@Component
public class TestListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
        if (event instanceof TestEvent) {
            System.out.println("test...test...");
        }
    }
}