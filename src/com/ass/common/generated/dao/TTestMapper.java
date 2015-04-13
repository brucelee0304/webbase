package com.ass.common.generated.dao;

import com.ass.common.generated.model.TTest;
import com.ass.common.generated.model.TTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int countByExample(TTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int deleteByExample(TTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int insert(TTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int insertSelective(TTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    List<TTest> selectByExample(TTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    TTest selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int updateByExampleSelective(@Param("record") TTest record, @Param("example") TTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int updateByExample(@Param("record") TTest record, @Param("example") TTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int updateByPrimaryKeySelective(TTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test
     *
     * @mbggenerated Tue Nov 18 19:42:57 CST 2014
     */
    int updateByPrimaryKey(TTest record);
}