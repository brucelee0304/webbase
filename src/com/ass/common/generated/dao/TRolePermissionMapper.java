package com.ass.common.generated.dao;

import com.ass.common.generated.model.TRolePermission;
import com.ass.common.generated.model.TRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int countByExample(TRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int deleteByExample(TRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int insert(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int insertSelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    List<TRolePermission> selectByExample(TRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    TRolePermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int updateByExampleSelective(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int updateByExample(@Param("record") TRolePermission record, @Param("example") TRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int updateByPrimaryKeySelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Tue Nov 18 08:58:40 CST 2014
     */
    int updateByPrimaryKey(TRolePermission record);
}