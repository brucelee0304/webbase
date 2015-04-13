package com.ass.common.generated.dao;

import com.ass.common.generated.model.TOrganization;
import com.ass.common.generated.model.TOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrganizationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int countByExample(TOrganizationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int deleteByExample(TOrganizationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int insert(TOrganization record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int insertSelective(TOrganization record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	List<TOrganization> selectByExample(TOrganizationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	TOrganization selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int updateByExampleSelective(@Param("record") TOrganization record,
			@Param("example") TOrganizationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int updateByExample(@Param("record") TOrganization record,
			@Param("example") TOrganizationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int updateByPrimaryKeySelective(TOrganization record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_organization
	 * @mbggenerated  Thu Jan 15 20:48:41 CST 2015
	 */
	int updateByPrimaryKey(TOrganization record);
}