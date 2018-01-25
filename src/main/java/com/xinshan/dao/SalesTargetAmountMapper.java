package com.xinshan.dao;

import com.xinshan.model.SalesTargetAmount;
import java.util.List;

public interface SalesTargetAmountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_target_amount
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sales_target_amount_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_target_amount
     *
     * @mbggenerated
     */
    int insert(SalesTargetAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_target_amount
     *
     * @mbggenerated
     */
    SalesTargetAmount selectByPrimaryKey(Integer sales_target_amount_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_target_amount
     *
     * @mbggenerated
     */
    List<SalesTargetAmount> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_target_amount
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SalesTargetAmount record);
}