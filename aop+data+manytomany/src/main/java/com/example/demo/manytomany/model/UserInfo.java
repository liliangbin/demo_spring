package com.example.demo.manytomany.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/8  17:04
 */
@Entity
public class UserInfo  implements Serializable {

    private static  final long serialVersionUID = 1L;
    private static final char[] salts = {'a','b','c','d','e','f','g','h','i','j','k','l','m','o','p','q'};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String tel;  //电话号码必须唯一。

    private String userName ;
    private String password ;

    private String salt;

    public static char[] getSalts() {
        return salts;
    }

    public String getUserSituation() {
        return userSituation;
    }

    public void setUserSituation(String userSituation) {
        this.userSituation = userSituation;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    private String portraitURL;
    private String userSituation;//地址

    @ManyToMany(fetch = FetchType.EAGER)//立即重数据库中加载数据。
    @JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roleList;//一个用户具有多个角色

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswod() {
        return password;
    }

    public void setPasswod(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPortraitURL() {
        return portraitURL;
    }

    public void setPortraitURL(String portraitURL) {
        this.portraitURL = portraitURL;
    }

    public UserInfo() {
        this.salt = "dsfsdf"; //后期把他改为随机生成的数据
    }

    public String getCredentialsSalt() {

        return this.userName + this.salt;

    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", portraitURL='" + portraitURL + '\'' +
                ", roleList=" + roleList +
                '}';
    }
}
