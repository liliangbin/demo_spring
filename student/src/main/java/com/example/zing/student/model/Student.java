package com.example.zing.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/18  12:23
 */
@Entity
@Table(name = "zing_student")
public class Student {

    @Id
    @Column(length = 8,unique = true)
    private String sno ;
    private String sname;
    private String ssex;
    private int sage;
    private String major;

    public Student(String sno, String sname, String ssex, int sage, String major) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        this.major = major;
    }

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
