package com.tousika.controller;

import com.tousika.exception.BussinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Value("${my.msg}")
    private String msg;


    @RequestMapping("/hello")
    public String index() {

        logger.info("hello跳转, topic:[{}]", "topic");
        int no=1/0;
        return this.msg;
    }

    @RequestMapping("/hello1")
    public String index1() {
        throw new BussinessException("100","用户名密码错误");
    }

}
