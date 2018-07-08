package com.example.demo.data.controller;

import com.example.demo.data.model.User;
import com.example.demo.data.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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


        Optional<User> user = userDao.findById(1L);
        return user.get().getBooks();

    }
}

