package com.sondh.gishop.mapper;

import com.sondh.gishop.entity.ShoppingSession;
import com.sondh.gishop.entity.ShoppingSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    long countByExample(ShoppingSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByExample(ShoppingSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insert(ShoppingSession row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insertSelective(ShoppingSession row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    List<ShoppingSession> selectByExample(ShoppingSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    ShoppingSession selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExampleSelective(@Param("row") ShoppingSession row, @Param("example") ShoppingSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExample(@Param("row") ShoppingSession row, @Param("example") ShoppingSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKeySelective(ShoppingSession row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_session
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKey(ShoppingSession row);
}