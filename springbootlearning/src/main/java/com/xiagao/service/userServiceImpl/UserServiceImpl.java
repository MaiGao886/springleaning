package com.xiagao.service.userServiceImpl;

import com.xiagao.dao.UserDao;
import com.xiagao.model.pojo.User;
import com.xiagao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl  {

    @Autowired
    private UserDao userRepository;

//    @Override
    public User findUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }

//    @Override
    public boolean saveOne(User user) {
        User user1 = userRepository.save(user);
        if (user1 != null) {
            return true;
        } else {
            return false;
        }
    }


}
