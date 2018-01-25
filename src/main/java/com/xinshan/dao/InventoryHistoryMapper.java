package com.xinshan.dao;

import com.xinshan.model.InventoryHistory;
import java.util.List;

public interface InventoryHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer inventory_history_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history
     *
     * @mbggenerated
     */
    int insert(InventoryHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history
     *
     * @mbggenerated
     */
    InventoryHistory selectByPrimaryKey(Integer inventory_history_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history
     *
     * @mbggenerated
     */
    List<InventoryHistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(InventoryHistory record);
}