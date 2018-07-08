package com.example.demo.aop.proxy;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  17:19
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy(new ReSubject());
        subject.request();
    }
}
