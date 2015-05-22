package com.eyre.spring.mybatis.mapper;

import com.eyre.spring.mybatis.entity.Test;
import com.github.abel533.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2015/5/18.
 */
@Repository
public interface TestMapper extends Mapper<Test> {

    List<Test> selectAll();

}