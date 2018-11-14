package com.example.demo.manytomany.repository;


import com.example.demo.manytomany.model.SysRole;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/8  23:15
 */
public interface SysRoleRepository extends CrudRepository<SysRole,Long> {
    SysRole findByRole(String role);
}
