package com.sondh.gishop.entity;

import java.util.Date;

public class UserPayment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.user_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.payment_type
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private String paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.provider
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private String provider;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.account_no
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Integer accountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_payment.expiry
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    private Date expiry;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.id
     *
     * @return the value of user_payment.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.id
     *
     * @param id the value for user_payment.id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.user_id
     *
     * @return the value of user_payment.user_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.user_id
     *
     * @param userId the value for user_payment.user_id
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.payment_type
     *
     * @return the value of user_payment.payment_type
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.payment_type
     *
     * @param paymentType the value for user_payment.payment_type
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.provider
     *
     * @return the value of user_payment.provider
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public String getProvider() {
        return provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.provider
     *
     * @param provider the value for user_payment.provider
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.account_no
     *
     * @return the value of user_payment.account_no
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Integer getAccountNo() {
        return accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.account_no
     *
     * @param accountNo the value for user_payment.account_no
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_payment.expiry
     *
     * @return the value of user_payment.expiry
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public Date getExpiry() {
        return expiry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_payment.expiry
     *
     * @param expiry the value for user_payment.expiry
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}