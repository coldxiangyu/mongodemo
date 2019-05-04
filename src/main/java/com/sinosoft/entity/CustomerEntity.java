package com.sinosoft.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author wangchao
 * @date 2019年05月03
 */

@Data
public class CustomerEntity {
    /**
     * 客户编号
     */
    @Id
    private String id;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 客户年龄
     */
    private int age;

    public CustomerEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
