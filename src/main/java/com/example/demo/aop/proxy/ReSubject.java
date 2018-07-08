package com.example.demo.aop.proxy;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  17:14
 */
public class ReSubject implements Subject {
    @Override
    public void request() {
        System.out.println("实现了接口类");
        System.out.println("ni shi ");
    }
}
