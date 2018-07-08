package com.example.demo.aop.inter;

import org.springframework.stereotype.Component;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  20:44
 */
@Component
public class InterContrller {

    @Timber(remove = true)
    public String name(){
        System.out.println("hello world");
        return "hello world";
    }
}
