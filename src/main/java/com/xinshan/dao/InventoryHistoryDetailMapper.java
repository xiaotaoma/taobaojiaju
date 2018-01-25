package com.xinshan.dao;

import com.xinshan.model.InventoryHistoryDetail;
import java.util.List;

public interface InventoryHistoryDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer inventory_history_detail_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history_detail
     *
     * @mbggenerated
     */
    int insert(InventoryHistoryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history_detail
     *
     * @mbggenerated
     */
    InventoryHistoryDetail selectByPrimaryKey(Integer inventory_history_detail_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history_detail
     *
     * @mbggenerated
     */
    List<InventoryHistoryDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory_history_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(InventoryHistoryDetail record);
}