package com.xinshan.dao;

import com.xinshan.model.OrderCarryFee;
import java.util.List;

public interface OrderCarryFeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_carry_fee
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer order_carry_fee_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_carry_fee
     *
     * @mbggenerated
     */
    int insert(OrderCarryFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_carry_fee
     *
     * @mbggenerated
     */
    OrderCarryFee selectByPrimaryKey(Integer order_carry_fee_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_carry_fee
     *
     * @mbggenerated
     */
    List<OrderCarryFee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_carry_fee
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderCarryFee record);
}