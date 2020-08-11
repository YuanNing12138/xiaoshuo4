package cn.kgc.crowd.service.impl;

import cn.kgc.crowd.entity.User;
import cn.kgc.crowd.mapper.UserMapper;
import cn.kgc.crowd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UserMapper;

    @Override
    public List<User> getUserByName(String username) {

        return UserMapper.getUserByName("%"+username+"%");
    }

    @Override
    public boolean saveUser(User user) {
        return UserMapper.saveUser(user)==1;
    }

    @Override
    public boolean delUser(Integer id) {
        return UserMapper.delUser(id)==1;
    }

    @Override
    public boolean updateUser(User user) {
        return UserMapper.updateUser(user)==1;
    }

    @Override
    public User getOne(Integer id) {
        return UserMapper.getOne(id);
    }

    @Override
    public User getUsersNamePassword(User user) {
        return UserMapper.getUsersNamePassword(user);
    }

}


  /*  @Override
    public Entry getEntryById(int id) {
        return entryMapper.getEntryById(id);
    }

    @Override
    public List<Entry> getAll(int categoryid) {
        return entryMapper.getAll(categoryid);
    }

    @Override
    public boolean saveEntry(Entry entry) {
        return entryMapper.saveEntry(entry)==1;
    }

    @Override
    public boolean delEntry(int id) {
        return entryMapper.delEntry(id)==1;
    }

    @Override
    public boolean updateEntry(Entry entry) {
        return entryMapper.updateEntry(entry)==1;
    }*/
