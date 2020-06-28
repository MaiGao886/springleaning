package com.xiagao.service;

import com.xiagao.model.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findUserByUsername(String username);

    public boolean saveOne(User user);
}
