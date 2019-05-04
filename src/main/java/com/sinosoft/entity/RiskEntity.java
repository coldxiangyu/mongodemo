package com.sinosoft.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author coldxiangyu
 * @date 2019/5/3 下午8:36
 */

@Data
public class RiskEntity {
    /**
     * id
     */
    @Id
    private String id;
    /**
     * 险种代码
     */
    private String riskCode;
    /**
     * 险种名称
     */
    private String riskName;
    /**
     * 险种保额
     */
    private String riskAmnt;
    /**
     * 险种保费
     */
    private String riskPrem;
    /**
     * 险种类型
     */
    private String riskType;
    /**
     * 销售渠道
     */
    private String riskChannel;
    /**
     * 缴费方式
     */
    private String riskPayMode;
    /**
     * 缴费期间
     */
    private String riskPayDueTime;
    /**
     * 保险期间
     */
    private String riskInsureDueTime;
    /**
     * 投保最大年龄
     */
    private String riskMaxInsureAge;
    /**
     * 投保最小年龄
     */
    private String riskMinInsureAge;

}
