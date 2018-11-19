package com.example.zing.student.dao;

import com.example.zing.student.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/18  12:48
 */
public interface StudentDao extends CrudRepository<Student, String> {
    Student findBySno(String sno);

    Student findBySname(String sname);

}

