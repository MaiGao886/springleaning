package com.xiagao.mapper;

import com.xiagao.model.pojo.mybatis.UserRoleEntity;
import java.util.List;

public interface UserRoleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int insert(UserRoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    UserRoleEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    List<UserRoleEntity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int updateByPrimaryKey(UserRoleEntity record);
}