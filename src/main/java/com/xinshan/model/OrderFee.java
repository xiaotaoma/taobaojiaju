package com.xinshan.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderFee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_id
     *
     * @mbggenerated
     */
    private Integer order_fee_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_type_id
     *
     * @mbggenerated
     */
    private Integer order_fee_type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.record_date
     *
     * @mbggenerated
     */
    private Date record_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.record_employee_code
     *
     * @mbggenerated
     */
    private String record_employee_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.record_employee_name
     *
     * @mbggenerated
     */
    private String record_employee_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_remark
     *
     * @mbggenerated
     */
    private String order_fee_remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_id
     *
     * @mbggenerated
     */
    private Integer order_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.inventory_history_id
     *
     * @mbggenerated
     */
    private Integer inventory_history_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.supplier_id
     *
     * @mbggenerated
     */
    private Integer supplier_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.worker_id
     *
     * @mbggenerated
     */
    private Integer worker_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_supplier_status
     *
     * @mbggenerated
     */
    private Integer order_fee_supplier_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_worker_status
     *
     * @mbggenerated
     */
    private Integer order_fee_worker_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.supplier_fee
     *
     * @mbggenerated
     */
    private BigDecimal supplier_fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.fhc_fee
     *
     * @mbggenerated
     */
    private BigDecimal fhc_fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.customer_fee
     *
     * @mbggenerated
     */
    private BigDecimal customer_fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.fee
     *
     * @mbggenerated
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.after_sales_id
     *
     * @mbggenerated
     */
    private Integer after_sales_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_check_status
     *
     * @mbggenerated
     */
    private Integer order_fee_check_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_check_employee_code
     *
     * @mbggenerated
     */
    private String order_fee_check_employee_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_check_employee_name
     *
     * @mbggenerated
     */
    private String order_fee_check_employee_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_check_date
     *
     * @mbggenerated
     */
    private Date order_fee_check_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_source
     *
     * @mbggenerated
     */
    private Integer order_fee_source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.order_fee_enable
     *
     * @mbggenerated
     */
    private Integer order_fee_enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.position_id
     *
     * @mbggenerated
     */
    private Integer position_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_fee.position_name
     *
     * @mbggenerated
     */
    private String position_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_id
     *
     * @return the value of order_fee.order_fee_id
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_id() {
        return order_fee_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_id
     *
     * @param order_fee_id the value for order_fee.order_fee_id
     *
     * @mbggenerated
     */
    public void setOrder_fee_id(Integer order_fee_id) {
        this.order_fee_id = order_fee_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_type_id
     *
     * @return the value of order_fee.order_fee_type_id
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_type_id() {
        return order_fee_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_type_id
     *
     * @param order_fee_type_id the value for order_fee.order_fee_type_id
     *
     * @mbggenerated
     */
    public void setOrder_fee_type_id(Integer order_fee_type_id) {
        this.order_fee_type_id = order_fee_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.record_date
     *
     * @return the value of order_fee.record_date
     *
     * @mbggenerated
     */
    public Date getRecord_date() {
        return record_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.record_date
     *
     * @param record_date the value for order_fee.record_date
     *
     * @mbggenerated
     */
    public void setRecord_date(Date record_date) {
        this.record_date = record_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.record_employee_code
     *
     * @return the value of order_fee.record_employee_code
     *
     * @mbggenerated
     */
    public String getRecord_employee_code() {
        return record_employee_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.record_employee_code
     *
     * @param record_employee_code the value for order_fee.record_employee_code
     *
     * @mbggenerated
     */
    public void setRecord_employee_code(String record_employee_code) {
        this.record_employee_code = record_employee_code == null ? null : record_employee_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.record_employee_name
     *
     * @return the value of order_fee.record_employee_name
     *
     * @mbggenerated
     */
    public String getRecord_employee_name() {
        return record_employee_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.record_employee_name
     *
     * @param record_employee_name the value for order_fee.record_employee_name
     *
     * @mbggenerated
     */
    public void setRecord_employee_name(String record_employee_name) {
        this.record_employee_name = record_employee_name == null ? null : record_employee_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_remark
     *
     * @return the value of order_fee.order_fee_remark
     *
     * @mbggenerated
     */
    public String getOrder_fee_remark() {
        return order_fee_remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_remark
     *
     * @param order_fee_remark the value for order_fee.order_fee_remark
     *
     * @mbggenerated
     */
    public void setOrder_fee_remark(String order_fee_remark) {
        this.order_fee_remark = order_fee_remark == null ? null : order_fee_remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_id
     *
     * @return the value of order_fee.order_id
     *
     * @mbggenerated
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_id
     *
     * @param order_id the value for order_fee.order_id
     *
     * @mbggenerated
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.inventory_history_id
     *
     * @return the value of order_fee.inventory_history_id
     *
     * @mbggenerated
     */
    public Integer getInventory_history_id() {
        return inventory_history_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.inventory_history_id
     *
     * @param inventory_history_id the value for order_fee.inventory_history_id
     *
     * @mbggenerated
     */
    public void setInventory_history_id(Integer inventory_history_id) {
        this.inventory_history_id = inventory_history_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.supplier_id
     *
     * @return the value of order_fee.supplier_id
     *
     * @mbggenerated
     */
    public Integer getSupplier_id() {
        return supplier_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.supplier_id
     *
     * @param supplier_id the value for order_fee.supplier_id
     *
     * @mbggenerated
     */
    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.worker_id
     *
     * @return the value of order_fee.worker_id
     *
     * @mbggenerated
     */
    public Integer getWorker_id() {
        return worker_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.worker_id
     *
     * @param worker_id the value for order_fee.worker_id
     *
     * @mbggenerated
     */
    public void setWorker_id(Integer worker_id) {
        this.worker_id = worker_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_supplier_status
     *
     * @return the value of order_fee.order_fee_supplier_status
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_supplier_status() {
        return order_fee_supplier_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_supplier_status
     *
     * @param order_fee_supplier_status the value for order_fee.order_fee_supplier_status
     *
     * @mbggenerated
     */
    public void setOrder_fee_supplier_status(Integer order_fee_supplier_status) {
        this.order_fee_supplier_status = order_fee_supplier_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_worker_status
     *
     * @return the value of order_fee.order_fee_worker_status
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_worker_status() {
        return order_fee_worker_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_worker_status
     *
     * @param order_fee_worker_status the value for order_fee.order_fee_worker_status
     *
     * @mbggenerated
     */
    public void setOrder_fee_worker_status(Integer order_fee_worker_status) {
        this.order_fee_worker_status = order_fee_worker_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.supplier_fee
     *
     * @return the value of order_fee.supplier_fee
     *
     * @mbggenerated
     */
    public BigDecimal getSupplier_fee() {
        return supplier_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.supplier_fee
     *
     * @param supplier_fee the value for order_fee.supplier_fee
     *
     * @mbggenerated
     */
    public void setSupplier_fee(BigDecimal supplier_fee) {
        this.supplier_fee = supplier_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.fhc_fee
     *
     * @return the value of order_fee.fhc_fee
     *
     * @mbggenerated
     */
    public BigDecimal getFhc_fee() {
        return fhc_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.fhc_fee
     *
     * @param fhc_fee the value for order_fee.fhc_fee
     *
     * @mbggenerated
     */
    public void setFhc_fee(BigDecimal fhc_fee) {
        this.fhc_fee = fhc_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.customer_fee
     *
     * @return the value of order_fee.customer_fee
     *
     * @mbggenerated
     */
    public BigDecimal getCustomer_fee() {
        return customer_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.customer_fee
     *
     * @param customer_fee the value for order_fee.customer_fee
     *
     * @mbggenerated
     */
    public void setCustomer_fee(BigDecimal customer_fee) {
        this.customer_fee = customer_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.fee
     *
     * @return the value of order_fee.fee
     *
     * @mbggenerated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.fee
     *
     * @param fee the value for order_fee.fee
     *
     * @mbggenerated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.after_sales_id
     *
     * @return the value of order_fee.after_sales_id
     *
     * @mbggenerated
     */
    public Integer getAfter_sales_id() {
        return after_sales_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.after_sales_id
     *
     * @param after_sales_id the value for order_fee.after_sales_id
     *
     * @mbggenerated
     */
    public void setAfter_sales_id(Integer after_sales_id) {
        this.after_sales_id = after_sales_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_check_status
     *
     * @return the value of order_fee.order_fee_check_status
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_check_status() {
        return order_fee_check_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_check_status
     *
     * @param order_fee_check_status the value for order_fee.order_fee_check_status
     *
     * @mbggenerated
     */
    public void setOrder_fee_check_status(Integer order_fee_check_status) {
        this.order_fee_check_status = order_fee_check_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_check_employee_code
     *
     * @return the value of order_fee.order_fee_check_employee_code
     *
     * @mbggenerated
     */
    public String getOrder_fee_check_employee_code() {
        return order_fee_check_employee_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_check_employee_code
     *
     * @param order_fee_check_employee_code the value for order_fee.order_fee_check_employee_code
     *
     * @mbggenerated
     */
    public void setOrder_fee_check_employee_code(String order_fee_check_employee_code) {
        this.order_fee_check_employee_code = order_fee_check_employee_code == null ? null : order_fee_check_employee_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_check_employee_name
     *
     * @return the value of order_fee.order_fee_check_employee_name
     *
     * @mbggenerated
     */
    public String getOrder_fee_check_employee_name() {
        return order_fee_check_employee_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_check_employee_name
     *
     * @param order_fee_check_employee_name the value for order_fee.order_fee_check_employee_name
     *
     * @mbggenerated
     */
    public void setOrder_fee_check_employee_name(String order_fee_check_employee_name) {
        this.order_fee_check_employee_name = order_fee_check_employee_name == null ? null : order_fee_check_employee_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_check_date
     *
     * @return the value of order_fee.order_fee_check_date
     *
     * @mbggenerated
     */
    public Date getOrder_fee_check_date() {
        return order_fee_check_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_check_date
     *
     * @param order_fee_check_date the value for order_fee.order_fee_check_date
     *
     * @mbggenerated
     */
    public void setOrder_fee_check_date(Date order_fee_check_date) {
        this.order_fee_check_date = order_fee_check_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_source
     *
     * @return the value of order_fee.order_fee_source
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_source() {
        return order_fee_source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_source
     *
     * @param order_fee_source the value for order_fee.order_fee_source
     *
     * @mbggenerated
     */
    public void setOrder_fee_source(Integer order_fee_source) {
        this.order_fee_source = order_fee_source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.order_fee_enable
     *
     * @return the value of order_fee.order_fee_enable
     *
     * @mbggenerated
     */
    public Integer getOrder_fee_enable() {
        return order_fee_enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.order_fee_enable
     *
     * @param order_fee_enable the value for order_fee.order_fee_enable
     *
     * @mbggenerated
     */
    public void setOrder_fee_enable(Integer order_fee_enable) {
        this.order_fee_enable = order_fee_enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.position_id
     *
     * @return the value of order_fee.position_id
     *
     * @mbggenerated
     */
    public Integer getPosition_id() {
        return position_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.position_id
     *
     * @param position_id the value for order_fee.position_id
     *
     * @mbggenerated
     */
    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_fee.position_name
     *
     * @return the value of order_fee.position_name
     *
     * @mbggenerated
     */
    public String getPosition_name() {
        return position_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_fee.position_name
     *
     * @param position_name the value for order_fee.position_name
     *
     * @mbggenerated
     */
    public void setPosition_name(String position_name) {
        this.position_name = position_name == null ? null : position_name.trim();
    }
}