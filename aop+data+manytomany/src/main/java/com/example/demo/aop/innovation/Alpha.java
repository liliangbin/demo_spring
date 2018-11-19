package com.example.demo.aop.innovation;

import org.springframework.stereotype.Component;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/7  18:02
 */
@Component
public class Alpha implements Person {
    @Override
    public String sayHello(String name) {
        System.out.println(".....sayHello().....");
        return  name + "hello world";
    }

    public void eat(String food){
        System.out.println("我正在吃。。。。"+food);
    }
}
