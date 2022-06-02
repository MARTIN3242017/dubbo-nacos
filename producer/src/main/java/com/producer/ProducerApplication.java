package com.producer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:15
 */

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.producer.service.impl"})
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}

