package com.example.zing.student.model;

import javax.persistence.*;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/18  12:27
 */
@Entity
@Table(name = "zing_award")
public class Award {

    @Id
    @Column(length = 8,unique = true) //长度定义
    private String sno;

    @Column(length = 2000)
    private String details;

    public Award(String sno, String details) {
        this.sno = sno;
        this.details = details;
    }

    public Award() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
