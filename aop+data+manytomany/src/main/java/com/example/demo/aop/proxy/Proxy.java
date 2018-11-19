package com.example.demo.aop.proxy;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  17:17
 */
public class Proxy implements Subject {
    private ReSubject reSubject;

    public Proxy( ReSubject reSubject){
        this.reSubject = reSubject;
    }
    @Override
    public void request() {
        System.out.println("before");
        try {
            reSubject.request();
        }catch (Exception e){
            throw  e;
        }finally {
            System.out.println("after");
        }
    }
}
