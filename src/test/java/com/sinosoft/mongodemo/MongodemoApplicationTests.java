package com.sinosoft.mongodemo;

import com.alibaba.fastjson.JSON;
import com.sinosoft.dao.CustomerRepository;
import com.sinosoft.dao.PolicyRepository;
import com.sinosoft.dao.RiskRepository;
import com.sinosoft.entity.CustomerEntity;
import com.sinosoft.entity.PolicyEntity;
import com.sinosoft.entity.RiskEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MongodemoApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RiskRepository riskRepository;
    @Autowired
    private PolicyRepository policyRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test1(){
        customerRepository.findByName("coldxiangyu");
    }
    @Test
    public void test2() {
        log.info(JSON.toJSONString(riskRepository.findAllByRiskCode("10086")));
    }
    @Test
    public void test3(){
        riskRepository.deleteAll();
        RiskEntity riskEntity = new RiskEntity();
        riskEntity.setRiskAmnt("200000");
        riskEntity.setRiskCode("10086");
        riskEntity.setRiskName("测试产品");
        riskEntity.setRiskChannel("网银");
        riskEntity.setRiskPayDueTime("10");
        riskEntity.setRiskInsureDueTime("10");
        riskRepository.save(riskEntity);
        RiskEntity riskEntity1 = new RiskEntity();
        riskEntity1.setRiskAmnt("200000");
        riskEntity1.setRiskCode("10087");
        riskEntity1.setRiskName("测试健康产品");
        riskEntity1.setRiskChannel("网银");
        riskEntity1.setRiskPayDueTime("10");
        riskEntity1.setRiskInsureDueTime("10");
        riskRepository.save(riskEntity1);
        RiskEntity riskEntity2 = new RiskEntity();
        riskEntity2.setRiskAmnt("200000");
        riskEntity2.setRiskCode("10088");
        riskEntity2.setRiskName("测试重疾产品");
        riskEntity2.setRiskChannel("网银");
        riskEntity2.setRiskPayDueTime("10");
        riskEntity2.setRiskInsureDueTime("10");
        riskRepository.save(riskEntity2);
    }
    @Test
    public void test4(){
        log.info(JSON.toJSONString(riskRepository.findAllByRiskNameContains("测试")));
        log.info(JSON.toJSONString(riskRepository.findAllByRiskNameContains("健康")));
    }
    @Test
    public void test5(){
        PolicyEntity policyEntity = new PolicyEntity();
        RiskEntity riskEntity = new RiskEntity();
        riskEntity.setRiskAmnt("200000");
        riskEntity.setRiskCode("10086");
        riskEntity.setRiskName("测试产品");
        riskEntity.setRiskChannel("网银");
        riskEntity.setRiskPayDueTime("10");
        riskEntity.setRiskInsureDueTime("10");
        CustomerEntity customerEntity = new CustomerEntity("张三",15);
        policyEntity.setBankAccName("123");
        policyEntity.setCustomerEntity(customerEntity);
        policyEntity.setRiskEntity(riskEntity);
        policyRepository.save(policyEntity);
    }
}
