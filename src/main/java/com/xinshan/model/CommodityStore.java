package com.xinshan.model;

public class CommodityStore {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_store.commodity_store_id
     *
     * @mbggenerated
     */
    private Integer commodity_store_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_store.store_name
     *
     * @mbggenerated
     */
    private String store_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_store.store_enable
     *
     * @mbggenerated
     */
    private Integer store_enable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_store.commodity_store_id
     *
     * @return the value of commodity_store.commodity_store_id
     *
     * @mbggenerated
     */
    public Integer getCommodity_store_id() {
        return commodity_store_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_store.commodity_store_id
     *
     * @param commodity_store_id the value for commodity_store.commodity_store_id
     *
     * @mbggenerated
     */
    public void setCommodity_store_id(Integer commodity_store_id) {
        this.commodity_store_id = commodity_store_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_store.store_name
     *
     * @return the value of commodity_store.store_name
     *
     * @mbggenerated
     */
    public String getStore_name() {
        return store_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_store.store_name
     *
     * @param store_name the value for commodity_store.store_name
     *
     * @mbggenerated
     */
    public void setStore_name(String store_name) {
        this.store_name = store_name == null ? null : store_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_store.store_enable
     *
     * @return the value of commodity_store.store_enable
     *
     * @mbggenerated
     */
    public Integer getStore_enable() {
        return store_enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_store.store_enable
     *
     * @param store_enable the value for commodity_store.store_enable
     *
     * @mbggenerated
     */
    public void setStore_enable(Integer store_enable) {
        this.store_enable = store_enable;
    }
}