package com.example.demo.data.repository;

import com.example.demo.data.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/10  10:21
 */
public interface UserDao extends CrudRepository<User,Long>{
    @Override
    Optional<User> findById(Long aLong);
}
