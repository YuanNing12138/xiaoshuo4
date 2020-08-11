package cn.kgc.crowd.service;

import cn.kgc.crowd.entity.User;

import java.util.List;

public interface UserService {
    //模糊查询
    List<User> getUserByName(String username);
    /*增加数据*/
    boolean  saveUser(User user);

    /*删除数据*/
    boolean delUser(Integer id);

    /*修改数据*/
    boolean  updateUser(User user);
    /*查询一个*/
    User getOne(Integer id);
    User getUsersNamePassword(User user);
}

