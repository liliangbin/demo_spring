package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/10  9:55
 */

@RestController

public class UserController {


    @Autowired
    private UserDao userDao;
    @GetMapping("")
    public Object nnn() {


        User user = userDao.findOne(1l);
        return user.getBooks();

    }
}

