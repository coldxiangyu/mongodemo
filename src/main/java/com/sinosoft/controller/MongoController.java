package com.sinosoft.controller;

import com.sinosoft.dao.MongoLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coldxiangyu
 * @date 2019/5/6 下午12:25
 */
@Slf4j
@RestController
public class MongoController {
    @Autowired
    private MongoLogRepository mongoLogRepository;
    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    public void test(){
        log.info("test mongolog insert");
    }
}
