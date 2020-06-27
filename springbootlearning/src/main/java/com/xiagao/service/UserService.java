package com.xiagao.service;

import com.xiagao.model.pojo.User;

public interface UserService {
    public User findUserByUsername(String username);

    public boolean saveOne(User user);
}
