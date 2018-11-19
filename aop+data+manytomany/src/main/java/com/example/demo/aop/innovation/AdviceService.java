package com.example.demo.aop.innovation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/7  18:05
 */
@Aspect
@Component
public class AdviceService {
    @Pointcut("within(com.example.demo.aop.innovation.Alpha)")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }
}
