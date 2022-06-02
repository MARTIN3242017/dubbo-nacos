package com.producer.service.impl;

import com.samh.service.producer.ProducerService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:21
 */
@Service
@DubboService
public class ProducerServiceImpl implements ProducerService {
    @Override
    public String returnName() {
        return "Producer-wankai";
    }
}