package com.sinosoft.dao;

import com.sinosoft.entity.RiskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author coldxiangyu
 * @date 2019/5/3 下午8:58
 */
public interface RiskRepository extends MongoRepository<RiskEntity, String> {
    List<RiskEntity> findAllByRiskAmntBetween(String amnt);
    List<RiskEntity> findAllByRiskChannel(String channel);
    RiskEntity findAllByRiskCode(String riskCode);
    List<RiskEntity> findAllByRiskNameContains(String name);
    List<RiskEntity> findAllByRiskPremBetween(String prem);
    List<RiskEntity> findAllByRiskInsureDueTimeBetween(String riskInsureDueTime);
}
