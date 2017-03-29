package me.remin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/29.
 */
@RestController
public class Test2Controller {
    @RequestMapping("/aaa")
    public String test2(){
        return "helloword21111";
    }
}
