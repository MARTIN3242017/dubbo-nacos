package com.samh.service.impl;

import com.samh.service.consumer.ConsumerService;
import com.samh.service.producer.ProducerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:21
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference
    private ProducerService producerService;

    @Scheduled(cron = "0/20 * * * * ?")
    @Override
    public String getName() {
        if (producerService == null) {
            System.out.println("producerService 为null");
        } else {
            System.out.println("成功消费到生产者的数据:" + producerService.returnName());
        }
        return "Consumer-wankai";
    }
}



