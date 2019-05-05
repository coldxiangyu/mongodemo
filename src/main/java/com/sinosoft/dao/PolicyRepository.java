package com.sinosoft.dao;

import com.sinosoft.entity.PolicyEntity;
import com.sinosoft.entity.RiskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author coldxiangyu
 * @date 2019/5/3 下午8:58
 */
public interface PolicyRepository extends MongoRepository<PolicyEntity, String> {

}
