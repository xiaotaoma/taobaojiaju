package com.xinshan.dao;

import com.xinshan.model.ActivityBrand;
import java.util.List;

public interface ActivityBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_brand
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer activity_brand_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_brand
     *
     * @mbggenerated
     */
    int insert(ActivityBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_brand
     *
     * @mbggenerated
     */
    ActivityBrand selectByPrimaryKey(Integer activity_brand_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_brand
     *
     * @mbggenerated
     */
    List<ActivityBrand> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityBrand record);
}