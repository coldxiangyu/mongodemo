package com.sinosoft.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author wangchao
 * @date 2019年05月05
 */

@Data
public class PolicyEntity {
    /**
     * 客户编号
     */
    @Id
    private String id;
    /**
     * 客户信息
     */
    private CustomerEntity customerEntity;
    /**
     * 险种信息
     */
    private RiskEntity riskEntity;
    /**
     * 保单号
     */
    private String policyNo;
    /**
     * 银行代码
     */
    private String bankCode;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 客户银行账号
     */
    private String bankAccNo;
    /**
     * 银行客户姓名
     */
    private String bankAccName;
    /**
     * 开始日期
     */
    private String startDate;
    /**
     * 失效日期
     */
    private String endDate;

}
