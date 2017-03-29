package me.remin.service.impl;

import com.github.pagehelper.PageHelper;

import me.remin.common.po.PageData;
import me.remin.entity.User;
import me.remin.mapper.UserMapper;
import me.remin.mapper.UsersMapper;
import me.remin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list(PageData pageData){
        if (pageData.get("pageNo") != null && pageData.get("pageSize") != null) {
            PageHelper.startPage(pageData.getInt("pageNo"),  pageData.getInt("pageSize") );
        }
        return userMapper.selectAll();
    }

    @Override
    public User queryUser(int id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
