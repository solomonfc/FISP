package com.synesoft.sysrunner.domain.model;

import org.hibernate.validator.constraints.NotEmpty;

import com.synesoft.sysrunner.app.BatchManage.model.BatchManageForm.BMG_TASK_Add;

public class BatTaskInfo {
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private String taskId;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_NAME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0015}")
	private String taskName;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.DIM_TYPE_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private String dimTypeId;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_START_TYPE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0016}")
	private String taskStartType;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_START_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0014}")
	private String taskStartTime;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_START_DAY
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private Short taskStartDay;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_START_TN
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private Short taskStartTn;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_END_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private String taskEndTime;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_POLLING_INTERVAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	private Integer taskPollingInterval;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.TASK_ENABLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0017}")
	private String taskEnable;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.ALLOW_MULTIPLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0012}")
	private String allowMultiple;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to
	 * the database column BAT_TASK_INFO.ALLOW_MANUAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	@NotEmpty(groups = { BMG_TASK_Add.class}, message = "{e.sysrunner.0013}")
	private String allowManual;

	private String taskStartTimeStart;

	private String taskStartTimeEnd;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_ID
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_ID
	 * 
	 * @param taskId
	 *            the value for BAT_TASK_INFO.TASK_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_NAME
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_NAME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_NAME
	 * 
	 * @param taskName
	 *            the value for BAT_TASK_INFO.TASK_NAME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.DIM_TYPE_ID
	 * 
	 * @return the value of BAT_TASK_INFO.DIM_TYPE_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getDimTypeId() {
		return dimTypeId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.DIM_TYPE_ID
	 * 
	 * @param dimTypeId
	 *            the value for BAT_TASK_INFO.DIM_TYPE_ID
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setDimTypeId(String dimTypeId) {
		this.dimTypeId = dimTypeId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_START_TYPE
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_START_TYPE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskStartType() {
		return taskStartType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_START_TYPE
	 * 
	 * @param taskStartType
	 *            the value for BAT_TASK_INFO.TASK_START_TYPE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskStartType(String taskStartType) {
		this.taskStartType = taskStartType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_START_TIME
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_START_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskStartTime() {
		return taskStartTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_START_TIME
	 * 
	 * @param taskStartTime
	 *            the value for BAT_TASK_INFO.TASK_START_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_START_DAY
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_START_DAY
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public Short getTaskStartDay() {
		return taskStartDay;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_START_DAY
	 * 
	 * @param taskStartDay
	 *            the value for BAT_TASK_INFO.TASK_START_DAY
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskStartDay(Short taskStartDay) {
		this.taskStartDay = taskStartDay;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_START_TN
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_START_TN
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public Short getTaskStartTn() {
		return taskStartTn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_START_TN
	 * 
	 * @param taskStartTn
	 *            the value for BAT_TASK_INFO.TASK_START_TN
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskStartTn(Short taskStartTn) {
		this.taskStartTn = taskStartTn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_END_TIME
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_END_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskEndTime() {
		return taskEndTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_END_TIME
	 * 
	 * @param taskEndTime
	 *            the value for BAT_TASK_INFO.TASK_END_TIME
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskEndTime(String taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_POLLING_INTERVAL
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_POLLING_INTERVAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public Integer getTaskPollingInterval() {
		return taskPollingInterval;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_POLLING_INTERVAL
	 * 
	 * @param taskPollingInterval
	 *            the value for BAT_TASK_INFO.TASK_POLLING_INTERVAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskPollingInterval(Integer taskPollingInterval) {
		this.taskPollingInterval = taskPollingInterval;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.TASK_ENABLE
	 * 
	 * @return the value of BAT_TASK_INFO.TASK_ENABLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getTaskEnable() {
		return taskEnable;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.TASK_ENABLE
	 * 
	 * @param taskEnable
	 *            the value for BAT_TASK_INFO.TASK_ENABLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setTaskEnable(String taskEnable) {
		this.taskEnable = taskEnable;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.ALLOW_MULTIPLE
	 * 
	 * @return the value of BAT_TASK_INFO.ALLOW_MULTIPLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getAllowMultiple() {
		return allowMultiple;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.ALLOW_MULTIPLE
	 * 
	 * @param allowMultiple
	 *            the value for BAT_TASK_INFO.ALLOW_MULTIPLE
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setAllowMultiple(String allowMultiple) {
		this.allowMultiple = allowMultiple;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column BAT_TASK_INFO.ALLOW_MANUAL
	 * 
	 * @return the value of BAT_TASK_INFO.ALLOW_MANUAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public String getAllowManual() {
		return allowManual;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column BAT_TASK_INFO.ALLOW_MANUAL
	 * 
	 * @param allowManual
	 *            the value for BAT_TASK_INFO.ALLOW_MANUAL
	 * 
	 * @abatorgenerated Thu Dec 05 17:02:49 CST 2013
	 */
	public void setAllowManual(String allowManual) {
		this.allowManual = allowManual;
	}

	public String getTaskStartTimeStart() {
		return taskStartTimeStart;
	}

	public void setTaskStartTimeStart(String taskStartTimeStart) {
		this.taskStartTimeStart = taskStartTimeStart;
	}

	public String getTaskStartTimeEnd() {
		return taskStartTimeEnd;
	}

	public void setTaskStartTimeEnd(String taskStartTimeEnd) {
		this.taskStartTimeEnd = taskStartTimeEnd;
	}
	
}