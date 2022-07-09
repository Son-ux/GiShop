package com.sondh.gishop.mapper;

import com.sondh.gishop.entity.Product;
import com.sondh.gishop.entity.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insert(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insertSelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Product row, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExample(@Param("row") Product row, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKeySelective(Product row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKey(Product row);
}