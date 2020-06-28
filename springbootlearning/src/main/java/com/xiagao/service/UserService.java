package com.xiagao.service;

import com.xiagao.model.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User findByUsername(String username);
    public User findById(Integer id);
    public List<User> findAll();
    public boolean saveOne(User user);

}
