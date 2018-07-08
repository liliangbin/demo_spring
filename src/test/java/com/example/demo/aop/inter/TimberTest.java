package com.example.demo.aop.inter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/7/8  20:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimberTest {
    @Autowired
    private InterContrller interContrller;
    @Test
    public void  name(){

        interContrller.name();

        System.out.println(interContrller.getClass());

    }
}
