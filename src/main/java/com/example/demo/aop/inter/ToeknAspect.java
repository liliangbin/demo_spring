package com.example.demo.aop.inter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  20:47
 */
@Aspect
@Component
public class ToeknAspect {

    @Pointcut("@annotation(com.example.demo.aop.inter.Timber)")
    public void aspect(){};

    @Before("aspect()")
    public void before(){
        System.out.println("切面，运行时间");
    }
}
