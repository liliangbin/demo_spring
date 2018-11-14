package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.model.TelProve;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/11/9  23:55
 */
public interface TelProveRepository extends CrudRepository<TelProve, Long> {

    Boolean existsByTelAndAndProveNumber(String tel,String proveNumber);

}
