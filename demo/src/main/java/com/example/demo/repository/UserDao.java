package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/10  10:21
 */
public interface UserDao extends CrudRepository<User,Long>{
}
