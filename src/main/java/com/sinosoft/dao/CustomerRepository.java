package com.sinosoft.dao;

import com.sinosoft.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangchao
 * @date 2019年05月03
 */

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

    CustomerEntity findByName(String name);
    List<CustomerEntity> findAllByAgeGreaterThan(int age);
}


