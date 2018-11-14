package com.example.demo.manytomany.repository;

import com.example.demo.data.model.User;
import com.example.demo.manytomany.model.UserInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/10  11:46
 */
public class UserInfoRepositoryTest {

    @Autowired
  private   UserInfoRepository userInfoRepository;
    @Test
    public void findByUserName() {

        UserInfo jk = new UserInfo();
        jk.setUserName("liliangbin");
        jk.setTel("17854226984");
        userInfoRepository.save(jk);
        try {
            UserInfo usdf = userInfoRepository.getUserInfoByUserName("liliangbin");
            System.out.println(usdf.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    @Test
    public void existsByUserName() {
    }

    @Test
    public void deleteByUserName() {
    }

    @Test
    public void existsByTel() {
    }

    @Test
    public void findByTel() {
    }
}