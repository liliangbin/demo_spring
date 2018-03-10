package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/10  9:59
 */

@Entity
@Table(name = "demoUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long useId;


    private String usename;
    @OneToMany(mappedBy="user",fetch=FetchType.EAGER)
    @JsonIgnore
    private List<Book> books;

    public long getUseId() {
        return useId;
    }

    public void setUseId(long useId) {
        this.useId = useId;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
