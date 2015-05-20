package com.eyre.spring.mybatis.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2015/5/20.
 */
public class TestEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public TestEvent(Object source) {
        super(source);
    }
}