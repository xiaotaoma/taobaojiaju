package com.xinshan.model;

public class CommoditySampleFixDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_sample_fix_detail.commodity_sample_fix_detail_id
     *
     * @mbggenerated
     */
    private Integer commodity_sample_fix_detail_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_sample_fix_detail.sample_fix_id
     *
     * @mbggenerated
     */
    private Integer sample_fix_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_sample_fix_detail.commodity_id
     *
     * @mbggenerated
     */
    private Integer commodity_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_sample_fix_detail.fix_detail_status
     *
     * @mbggenerated
     */
    private Integer fix_detail_status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_sample_fix_detail.fix_detail_remark
     *
     * @mbggenerated
     */
    private String fix_detail_remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_sample_fix_detail.commodity_sample_fix_detail_id
     *
     * @return the value of commodity_sample_fix_detail.commodity_sample_fix_detail_id
     *
     * @mbggenerated
     */
    public Integer getCommodity_sample_fix_detail_id() {
        return commodity_sample_fix_detail_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_sample_fix_detail.commodity_sample_fix_detail_id
     *
     * @param commodity_sample_fix_detail_id the value for commodity_sample_fix_detail.commodity_sample_fix_detail_id
     *
     * @mbggenerated
     */
    public void setCommodity_sample_fix_detail_id(Integer commodity_sample_fix_detail_id) {
        this.commodity_sample_fix_detail_id = commodity_sample_fix_detail_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_sample_fix_detail.sample_fix_id
     *
     * @return the value of commodity_sample_fix_detail.sample_fix_id
     *
     * @mbggenerated
     */
    public Integer getSample_fix_id() {
        return sample_fix_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_sample_fix_detail.sample_fix_id
     *
     * @param sample_fix_id the value for commodity_sample_fix_detail.sample_fix_id
     *
     * @mbggenerated
     */
    public void setSample_fix_id(Integer sample_fix_id) {
        this.sample_fix_id = sample_fix_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_sample_fix_detail.commodity_id
     *
     * @return the value of commodity_sample_fix_detail.commodity_id
     *
     * @mbggenerated
     */
    public Integer getCommodity_id() {
        return commodity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_sample_fix_detail.commodity_id
     *
     * @param commodity_id the value for commodity_sample_fix_detail.commodity_id
     *
     * @mbggenerated
     */
    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_sample_fix_detail.fix_detail_status
     *
     * @return the value of commodity_sample_fix_detail.fix_detail_status
     *
     * @mbggenerated
     */
    public Integer getFix_detail_status() {
        return fix_detail_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_sample_fix_detail.fix_detail_status
     *
     * @param fix_detail_status the value for commodity_sample_fix_detail.fix_detail_status
     *
     * @mbggenerated
     */
    public void setFix_detail_status(Integer fix_detail_status) {
        this.fix_detail_status = fix_detail_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_sample_fix_detail.fix_detail_remark
     *
     * @return the value of commodity_sample_fix_detail.fix_detail_remark
     *
     * @mbggenerated
     */
    public String getFix_detail_remark() {
        return fix_detail_remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_sample_fix_detail.fix_detail_remark
     *
     * @param fix_detail_remark the value for commodity_sample_fix_detail.fix_detail_remark
     *
     * @mbggenerated
     */
    public void setFix_detail_remark(String fix_detail_remark) {
        this.fix_detail_remark = fix_detail_remark == null ? null : fix_detail_remark.trim();
    }
}