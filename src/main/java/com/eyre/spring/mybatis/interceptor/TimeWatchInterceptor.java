package com.eyre.spring.mybatis.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;

/**
 * Created by Administrator on 2015/5/19.
 */
public class TimeWatchInterceptor implements HandlerInterceptor {

    private long preCurrent = 0l;
    private long aftCurrent = 0l;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        preCurrent = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        aftCurrent = System.currentTimeMillis();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String url = request.getRequestURI();
        long time = aftCurrent - preCurrent;
        System.out.println(String.format("%s 消耗 %d 毫秒", url, time));
    }
}