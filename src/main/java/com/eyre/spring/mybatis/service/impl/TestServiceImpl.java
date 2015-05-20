package com.eyre.spring.mybatis.service.impl;

import com.eyre.spring.mybatis.entity.Test;
import com.eyre.spring.mybatis.mapper.TestMapper;
import com.eyre.spring.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/5/18.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

}