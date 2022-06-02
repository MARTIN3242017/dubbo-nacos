package com.producer;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:15
 */
@EnableScheduling
@SpringBootApplication
@NacosConfigurationProperties(dataId = "demo-dev.yml", autoRefreshed = true, type = ConfigType.YAML)
@DubboComponentScan(basePackages = {"com.producer.service.impl"})
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}

