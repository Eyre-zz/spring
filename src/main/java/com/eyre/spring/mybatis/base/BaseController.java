package com.eyre.spring.mybatis.base;

import com.eyre.spring.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2015/5/18.
 */
public class BaseController {

    @Autowired
    protected TestService testService;

}