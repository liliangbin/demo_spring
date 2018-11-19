package com.example.demo;

import com.example.demo.aop.innovation.Person;
import com.example.demo.manytomany.model.SysPermission;
import com.example.demo.manytomany.model.SysRole;
import com.example.demo.manytomany.model.UserInfo;
import com.example.demo.manytomany.repository.SysRoleRepository;
import com.example.demo.manytomany.repository.UserInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.management.relation.Role;
import javax.swing.plaf.PanelUI;
import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Person alpha;
    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private SysRoleRepository roleRepository;
    @Test
    public void contextLoads() {

        alpha.sayHello("listen");
    }

    @Test
    public void sdfs() {


        UserInfo userInfo = repository.getUserInfoByUserName("liliangbin");

        System.out.println(userInfo.toString());
        List<SysRole> roles = new ArrayList<>();

        for (SysRole role : userInfo.getRoleList()) {

            roles.add(role);
            for (SysPermission permission :role.getPermissions()){
                System.out.println(permission.getName());
            }

        }

/*        for (SysRole role : roles) {

            System.out.println(role.getRole());
            for (SysPermission permission : role.getPermissions()) {
                System.out.println(permission.getName());
            }
        }*/

    }


    @Test
    public void  in(){
        SysRole role = roleRepository.findByRole("co");
        System.out.println(role.toString());
        System.out.println(role.getRole());
        for (SysPermission permission : role.getPermissions()){
            System.out.println(permission.getName());
        }
    }

}
