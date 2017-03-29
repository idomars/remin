package me.remin.controller;

import com.github.pagehelper.PageInfo;
import me.remin.common.base.BaseController;
import me.remin.common.po.PageData;
import me.remin.entity.User;
import me.remin.entity.Users;
import me.remin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/3/29.
 */
@RestController
public class Test2Controller extends BaseController{
    @Autowired
    private IUserService userService;



    @RequestMapping("/aaa")
    public String test2(){
        return "helloword21111";
    }

    @RequestMapping("/user")
    public PageInfo<User> list(){

        PageData pageData = new PageData();
        pageData = this.getPageData();
        PageInfo<User> page = new PageInfo(userService.list(pageData));
        return page;
    }
}
