package com.xiagao.service.userServiceImpl;

import com.xiagao.dao.UserDao;
import com.xiagao.model.pojo.jpa.User;
import com.xiagao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userRepository;

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public boolean saveOne(User user) {
        User user1 = userRepository.save(user);
        if (user1 != null) {
            return true;
        } else {
            return false;
        }
    }


}
