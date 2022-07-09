package com.sondh.gishop.mapper;

import com.sondh.gishop.entity.PaymentDetails;
import com.sondh.gishop.entity.PaymentDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    long countByExample(PaymentDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByExample(PaymentDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insert(PaymentDetails row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insertSelective(PaymentDetails row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    List<PaymentDetails> selectByExample(PaymentDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    PaymentDetails selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExampleSelective(@Param("row") PaymentDetails row, @Param("example") PaymentDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExample(@Param("row") PaymentDetails row, @Param("example") PaymentDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKeySelective(PaymentDetails row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_details
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKey(PaymentDetails row);
}