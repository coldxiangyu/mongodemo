package com.sinosoft;

import com.alibaba.fastjson.JSON;
import com.sinosoft.dao.CustomerRepository;
import com.sinosoft.entity.CustomerEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangchao
 * @date 2019年05月03
 */
@Slf4j
@SpringBootApplication
public class MongodemoApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongodemoApplication.class, args);
    }

    @Override
    public void run(String... args){
        customerRepository.deleteAll();
        customerRepository.save(new CustomerEntity("coldxiangyu",28));
        customerRepository.save(new CustomerEntity("coldxiangyu",29));
        customerRepository.save(new CustomerEntity("coldxiangyu",30));
        customerRepository.save(new CustomerEntity("coldxiangyu",31));
        customerRepository.save(new CustomerEntity("coldxiangyu",32));
        customerRepository.save(new CustomerEntity("coldxiangyu",33));
        //log.info(JSON.toJSONString(customerRepository.findByName("coldxiangyu")));

        log.info(JSON.toJSONString(customerRepository.findAll()));
        log.info(JSON.toJSONString(customerRepository.findAllByAgeGreaterThan(30)));
    }

}
