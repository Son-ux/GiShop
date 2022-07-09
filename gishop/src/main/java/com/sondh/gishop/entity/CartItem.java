package com.sondh.gishop.entity;

import java.util.Date;

public class CartItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.session_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.product_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.quantity
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Date modifiedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.id
     *
     * @return the value of cart_item.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.id
     *
     * @param id the value for cart_item.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.session_id
     *
     * @return the value of cart_item.session_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.session_id
     *
     * @param sessionId the value for cart_item.session_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.product_id
     *
     * @return the value of cart_item.product_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.product_id
     *
     * @param productId the value for cart_item.product_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.quantity
     *
     * @return the value of cart_item.quantity
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.quantity
     *
     * @param quantity the value for cart_item.quantity
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.create_at
     *
     * @return the value of cart_item.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.create_at
     *
     * @param createAt the value for cart_item.create_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.modified_at
     *
     * @return the value of cart_item.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.modified_at
     *
     * @param modifiedAt the value for cart_item.modified_at
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}