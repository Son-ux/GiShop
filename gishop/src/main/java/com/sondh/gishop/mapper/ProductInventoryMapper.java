package com.sondh.gishop.mapper;

import com.sondh.gishop.entity.ProductInventory;
import com.sondh.gishop.entity.ProductInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInventoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    long countByExample(ProductInventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByExample(ProductInventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insert(ProductInventory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int insertSelective(ProductInventory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    List<ProductInventory> selectByExample(ProductInventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    ProductInventory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExampleSelective(@Param("row") ProductInventory row, @Param("example") ProductInventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByExample(@Param("row") ProductInventory row, @Param("example") ProductInventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKeySelective(ProductInventory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_inventory
     *
     * @mbg.generated Sat Jul 09 14:36:10 ICT 2022
     */
    int updateByPrimaryKey(ProductInventory row);
}