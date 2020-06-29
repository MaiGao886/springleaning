package com.xiagao.service;

import com.xiagao.model.pojo.jpa.User;
import com.xiagao.model.pojo.mybatis.UserM;

import java.util.List;

public interface UserService {
    public User findByUsername(String username);
    public UserM selectByUsername(String username);
    public User findById(Integer id);
    public List<User> findAll();
    public boolean saveOne(User user);

}
