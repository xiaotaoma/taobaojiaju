package com.xinshan.model;

public class Position {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.position_id
     *
     * @mbggenerated
     */
    private Integer position_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.position_name
     *
     * @mbggenerated
     */
    private String position_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.position_parent_id
     *
     * @mbggenerated
     */
    private Integer position_parent_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.position_desc
     *
     * @mbggenerated
     */
    private String position_desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.visible_position_ids
     *
     * @mbggenerated
     */
    private String visible_position_ids;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.daogou
     *
     * @mbggenerated
     */
    private Integer daogou;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.position_id
     *
     * @return the value of position.position_id
     *
     * @mbggenerated
     */
    public Integer getPosition_id() {
        return position_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.position_id
     *
     * @param position_id the value for position.position_id
     *
     * @mbggenerated
     */
    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.position_name
     *
     * @return the value of position.position_name
     *
     * @mbggenerated
     */
    public String getPosition_name() {
        return position_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.position_name
     *
     * @param position_name the value for position.position_name
     *
     * @mbggenerated
     */
    public void setPosition_name(String position_name) {
        this.position_name = position_name == null ? null : position_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.position_parent_id
     *
     * @return the value of position.position_parent_id
     *
     * @mbggenerated
     */
    public Integer getPosition_parent_id() {
        return position_parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.position_parent_id
     *
     * @param position_parent_id the value for position.position_parent_id
     *
     * @mbggenerated
     */
    public void setPosition_parent_id(Integer position_parent_id) {
        this.position_parent_id = position_parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.position_desc
     *
     * @return the value of position.position_desc
     *
     * @mbggenerated
     */
    public String getPosition_desc() {
        return position_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.position_desc
     *
     * @param position_desc the value for position.position_desc
     *
     * @mbggenerated
     */
    public void setPosition_desc(String position_desc) {
        this.position_desc = position_desc == null ? null : position_desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.visible_position_ids
     *
     * @return the value of position.visible_position_ids
     *
     * @mbggenerated
     */
    public String getVisible_position_ids() {
        return visible_position_ids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.visible_position_ids
     *
     * @param visible_position_ids the value for position.visible_position_ids
     *
     * @mbggenerated
     */
    public void setVisible_position_ids(String visible_position_ids) {
        this.visible_position_ids = visible_position_ids == null ? null : visible_position_ids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.daogou
     *
     * @return the value of position.daogou
     *
     * @mbggenerated
     */
    public Integer getDaogou() {
        return daogou;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.daogou
     *
     * @param daogou the value for position.daogou
     *
     * @mbggenerated
     */
    public void setDaogou(Integer daogou) {
        this.daogou = daogou;
    }
}