package com.producer.service.impl;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.samh.service.producer.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:21
 */
@Slf4j
@Service
@DubboService
public class ProducerServiceImpl implements ProducerService {
    @NacosValue(value = "${name}", autoRefreshed = true)
    private String name;

    public String returnNacosConf() {
        System.out.println("动态配置:name:" + name);
        return name;
    }

    @Override
    public String returnName() {
        return "Producer-wankai";
    }
}