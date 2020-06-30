package com.xiagao.mapper;

import com.xiagao.model.pojo.mybatis.UserM;
import java.util.List;

public interface UserMMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserM record);

    UserM selectByPrimaryKey(Integer id);

    UserM selectByUsername(String username);

    List<UserM> selectAll();

    int updateByPrimaryKey(UserM record);
}
