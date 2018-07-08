package com.example.demo;

import com.example.demo.aop.innovation.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class DemoApplication {
    @Autowired
    private Person alpha;
    @RequestMapping("/test")
    public void test(){
        alpha.sayHello("listen");
        System.out.println(alpha.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
