package com.sinosoft.mongo;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.mongodb.BasicDBObject;
import com.sinosoft.context.ApplicationContextProvider;
import com.sinosoft.dao.MongoLogRepository;
import com.sinosoft.entity.MongoLogEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author coldxiangyu
 * @date 2019/5/5 下午8:42
 */

/**
 * MongoDBAppender
 * 个性化输出日志到mongo
 */
@Slf4j
@Component
public class MongoDBAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    @Override
    protected void append(ILoggingEvent eventObject) {
        MongoTemplate mongoTemplate = ApplicationContextProvider.getBean(MongoTemplate.class);
        if (mongoTemplate != null) {
            MongoLogEntity mongoLogEntity = new MongoLogEntity();
            mongoLogEntity.setLevel(eventObject.getLevel().toString());
            mongoLogEntity.setLogger(eventObject.getLoggerName());
            mongoLogEntity.setThread(eventObject.getThreadName());
            mongoLogEntity.setMessage(eventObject.getFormattedMessage());
            mongoLogEntity.setDate(eventObject.getTimeStamp());
            mongoTemplate.save(mongoLogEntity);
        }
    }

}
