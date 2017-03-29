package me.remin.service;


import me.remin.common.po.PageData;
import me.remin.entity.User;
import me.remin.entity.Users;

import java.util.List;

/**
 * Created by Administrator on 2017/1/6.
 */
public interface IUserService {
    List<User> list(PageData pageData);

    User queryUser(int id);
}
