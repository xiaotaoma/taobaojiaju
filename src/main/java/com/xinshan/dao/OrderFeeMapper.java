package com.xinshan.dao;

import com.xinshan.model.OrderFee;
import java.util.List;

public interface OrderFeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_fee
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer order_fee_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_fee
     *
     * @mbggenerated
     */
    int insert(OrderFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_fee
     *
     * @mbggenerated
     */
    OrderFee selectByPrimaryKey(Integer order_fee_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_fee
     *
     * @mbggenerated
     */
    List<OrderFee> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_fee
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderFee record);
}