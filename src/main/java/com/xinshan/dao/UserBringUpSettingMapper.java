package com.xinshan.dao;

import com.xinshan.model.UserBringUpSetting;
import java.util.List;

public interface UserBringUpSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bring_up_setting
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer user_bring_up_setting_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bring_up_setting
     *
     * @mbggenerated
     */
    int insert(UserBringUpSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bring_up_setting
     *
     * @mbggenerated
     */
    UserBringUpSetting selectByPrimaryKey(Integer user_bring_up_setting_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bring_up_setting
     *
     * @mbggenerated
     */
    List<UserBringUpSetting> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_bring_up_setting
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserBringUpSetting record);
}