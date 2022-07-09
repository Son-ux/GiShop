package com.sondh.gishop.entity;

import java.util.Date;

public class ProductCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.decription
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private String decription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Date modifiedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.del_flag
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Boolean delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.id
     *
     * @return the value of product_category.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.id
     *
     * @param id the value for product_category.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category
     *
     * @return the value of product_category.category
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category
     *
     * @param category the value for product_category.category
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.decription
     *
     * @return the value of product_category.decription
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public String getDecription() {
        return decription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.decription
     *
     * @param decription the value for product_category.decription
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setDecription(String decription) {
        this.decription = decription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.create_at
     *
     * @return the value of product_category.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.create_at
     *
     * @param createAt the value for product_category.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.modified_at
     *
     * @return the value of product_category.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.modified_at
     *
     * @param modifiedAt the value for product_category.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.del_flag
     *
     * @return the value of product_category.del_flag
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.del_flag
     *
     * @param delFlag the value for product_category.del_flag
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}