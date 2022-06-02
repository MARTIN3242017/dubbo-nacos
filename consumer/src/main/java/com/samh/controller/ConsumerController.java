package com.samh.controller;

import com.samh.service.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author WANKAI
 * @Date 2021/12/11 13:20
 */
@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/consumer")
    public String one() {
        return consumerService.getName();
    }

}
