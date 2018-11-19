package com.example.zing.student.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest {

    @Test
    public void index() {

        String userinfo = "fasdfasdf,asdffasdfas,asdfasdfa,asfasdf";
        String [] strs = userinfo.split(",");
        for (String str :strs){
            System.out.println(str);
        }
    }
}