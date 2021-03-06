package com.ass.common.generated.dao;

import com.ass.common.generated.model.TApplyMoney;
import com.ass.common.generated.model.TApplyMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApplyMoneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int countByExample(TApplyMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int deleteByExample(TApplyMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int insert(TApplyMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int insertSelective(TApplyMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    List<TApplyMoney> selectByExample(TApplyMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    TApplyMoney selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int updateByExampleSelective(@Param("record") TApplyMoney record, @Param("example") TApplyMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int updateByExample(@Param("record") TApplyMoney record, @Param("example") TApplyMoneyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int updateByPrimaryKeySelective(TApplyMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_apply_money
     *
     * @mbggenerated Fri Apr 10 14:23:59 CST 2015
     */
    int updateByPrimaryKey(TApplyMoney record);
}