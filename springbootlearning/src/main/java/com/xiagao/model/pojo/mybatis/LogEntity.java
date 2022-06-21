package com.xiagao.model.pojo.mybatis;

import java.io.Serializable;

public class LogEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.log_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer logType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.content
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.user_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.time
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_log
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.id
     *
     * @return the value of t_log.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.id
     *
     * @param id the value for t_log.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.log_type
     *
     * @return the value of t_log.log_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.log_type
     *
     * @param logType the value for t_log.log_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.content
     *
     * @return the value of t_log.content
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.content
     *
     * @param content the value for t_log.content
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.user_id
     *
     * @return the value of t_log.user_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.user_id
     *
     * @param userId the value for t_log.user_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.time
     *
     * @return the value of t_log.time
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.time
     *
     * @param time the value for t_log.time
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_log
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
        sb.append(", logType=").append(logType);
        sb.append(", content=").append(content);
        sb.append(", userId=").append(userId);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}