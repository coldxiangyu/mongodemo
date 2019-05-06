package com.sinosoft.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @author coldxiangyu
 * @date 2019/5/6 上午9:05
 */
@Data
public class MongoLogEntity {
    @Id
    private String id;
    private Date date;
    private String level;
    private String msg;
    private String thread;

}
