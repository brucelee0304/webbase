package com.ass.common.generated.model;

public class TLog {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.t_user_id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private Long tUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.operate_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private String operateType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.create_time
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private Integer createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.log_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private String logType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.comment
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private String comment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_log.isdelete
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	private Integer isdelete;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.id
	 * @return  the value of t_log.id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.id
	 * @param id  the value for t_log.id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.t_user_id
	 * @return  the value of t_log.t_user_id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public Long gettUserId() {
		return tUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.t_user_id
	 * @param tUserId  the value for t_log.t_user_id
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void settUserId(Long tUserId) {
		this.tUserId = tUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.operate_type
	 * @return  the value of t_log.operate_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public String getOperateType() {
		return operateType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.operate_type
	 * @param operateType  the value for t_log.operate_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType == null ? null : operateType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.create_time
	 * @return  the value of t_log.create_time
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public Integer getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.create_time
	 * @param createTime  the value for t_log.create_time
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.log_type
	 * @return  the value of t_log.log_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public String getLogType() {
		return logType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.log_type
	 * @param logType  the value for t_log.log_type
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setLogType(String logType) {
		this.logType = logType == null ? null : logType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.comment
	 * @return  the value of t_log.comment
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.comment
	 * @param comment  the value for t_log.comment
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_log.isdelete
	 * @return  the value of t_log.isdelete
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public Integer getIsdelete() {
		return isdelete;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_log.isdelete
	 * @param isdelete  the value for t_log.isdelete
	 * @mbggenerated  Wed Nov 26 15:44:32 CST 2014
	 */
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
}