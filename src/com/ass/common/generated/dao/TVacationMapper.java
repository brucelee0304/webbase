package com.ass.common.generated.dao;

import com.ass.common.generated.model.TVacation;
import com.ass.common.generated.model.TVacationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVacationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int countByExample(TVacationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int deleteByExample(TVacationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int insert(TVacation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int insertSelective(TVacation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	List<TVacation> selectByExample(TVacationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	TVacation selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int updateByExampleSelective(@Param("record") TVacation record,
			@Param("example") TVacationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int updateByExample(@Param("record") TVacation record,
			@Param("example") TVacationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int updateByPrimaryKeySelective(TVacation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vacation
	 * @mbggenerated  Sat Jan 10 15:17:35 CST 2015
	 */
	int updateByPrimaryKey(TVacation record);
}