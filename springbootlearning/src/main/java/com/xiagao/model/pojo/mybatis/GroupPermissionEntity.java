package com.xiagao.model.pojo.mybatis;

import java.io.Serializable;

public class GroupPermissionEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group_permission.group_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer permissionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_group_permission
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group_permission.id
     *
     * @return the value of t_group_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group_permission.id
     *
     * @param id the value for t_group_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group_permission.group_id
     *
     * @return the value of t_group_permission.group_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group_permission.group_id
     *
     * @param groupId the value for t_group_permission.group_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group_permission.permission_id
     *
     * @return the value of t_group_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group_permission.permission_id
     *
     * @param permissionId the value for t_group_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group_permission.permission_type
     *
     * @return the value of t_group_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getPermissionType() {
        return permissionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group_permission.permission_type
     *
     * @param permissionType the value for t_group_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_group_permission
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", permissionType=").append(permissionType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}