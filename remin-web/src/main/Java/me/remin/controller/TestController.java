package me.remin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/29.
 */
@RestController
public class TestController {
//    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/test")
    public String test(){
//        logger.info("hello sowrd");
        return "hello World";
    }
}
