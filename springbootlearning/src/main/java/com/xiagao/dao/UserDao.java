package com.xiagao.dao;

import com.xiagao.model.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    //通过username查询一条记录
    User findByUsername(String username);
    //保存一条User记录
    User save(User user);
}
