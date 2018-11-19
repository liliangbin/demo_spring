package com.example.zing.student.dao;

import com.example.zing.student.model.Award;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/18  12:50
 */
public interface AwardDao extends CrudRepository<Award, String> {

    Award findBySno(String sno);
}
