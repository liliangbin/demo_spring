package com.example.demo.manytomany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/9  23:50
 */
@Entity
public class TelProve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  id;

    private String tel;
    private String proveNumber;

    public TelProve(String tel, String proveNumber) {
        this.tel = tel;
        this.proveNumber = proveNumber;
    }

    public TelProve() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProveNumber() {
        return proveNumber;
    }

    public void setProveNumber(String proveNumber) {
        this.proveNumber = proveNumber;
    }
}
