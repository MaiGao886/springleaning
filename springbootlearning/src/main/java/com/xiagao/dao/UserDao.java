package com.xiagao.dao;

import com.xiagao.model.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserDao extends JpaRepository<User, Long> {
    //通过username查询一条记录
    @Query(value = "select * from user where username = ?1",nativeQuery = true)
    User findByUsername(String username);

}
