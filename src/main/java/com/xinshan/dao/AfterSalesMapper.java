package com.xinshan.dao;

import com.xinshan.model.AfterSales;
import java.util.List;

public interface AfterSalesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_sales
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer after_sales_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_sales
     *
     * @mbggenerated
     */
    int insert(AfterSales record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_sales
     *
     * @mbggenerated
     */
    AfterSales selectByPrimaryKey(Integer after_sales_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_sales
     *
     * @mbggenerated
     */
    List<AfterSales> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table after_sales
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AfterSales record);
}