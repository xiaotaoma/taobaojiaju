package com.xinshan.model;

public class DeliveryType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_type.delivery_type_id
     *
     * @mbggenerated
     */
    private Integer delivery_type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_type.delivery_type_name
     *
     * @mbggenerated
     */
    private String delivery_type_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_type.delivery_type_id
     *
     * @return the value of delivery_type.delivery_type_id
     *
     * @mbggenerated
     */
    public Integer getDelivery_type_id() {
        return delivery_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_type.delivery_type_id
     *
     * @param delivery_type_id the value for delivery_type.delivery_type_id
     *
     * @mbggenerated
     */
    public void setDelivery_type_id(Integer delivery_type_id) {
        this.delivery_type_id = delivery_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_type.delivery_type_name
     *
     * @return the value of delivery_type.delivery_type_name
     *
     * @mbggenerated
     */
    public String getDelivery_type_name() {
        return delivery_type_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_type.delivery_type_name
     *
     * @param delivery_type_name the value for delivery_type.delivery_type_name
     *
     * @mbggenerated
     */
    public void setDelivery_type_name(String delivery_type_name) {
        this.delivery_type_name = delivery_type_name == null ? null : delivery_type_name.trim();
    }
}