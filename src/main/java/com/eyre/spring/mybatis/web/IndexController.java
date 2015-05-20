package com.eyre.spring.mybatis.web;

import com.eyre.spring.mybatis.base.BaseController;
import com.eyre.spring.mybatis.spring.event.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2015/5/18.
 */
@Controller
public class IndexController extends BaseController {

    @Autowired
    private ApplicationContext ac;

    @RequestMapping("test")
    public @ResponseBody Object test() {
        ac.publishEvent(new TestEvent("test!!!"));
        return "";
    }

    @RequestMapping("123")
    public String index() {
        return "index";
    }
}