package com.synesoft.fisp.domain.model;

public class SysChgSysLogWithBLOBs extends SysChgSysLog {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_CHG_SYS_LOG.DATA_BEFORE
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	private String dataBefore;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_CHG_SYS_LOG.DATA_AFTER
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	private String dataAfter;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_CHG_SYS_LOG.DATA_BEFORE
	 * @return  the value of SYS_CHG_SYS_LOG.DATA_BEFORE
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	public String getDataBefore() {
		return dataBefore;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_CHG_SYS_LOG.DATA_BEFORE
	 * @param dataBefore  the value for SYS_CHG_SYS_LOG.DATA_BEFORE
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	public void setDataBefore(String dataBefore) {
		this.dataBefore = dataBefore;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_CHG_SYS_LOG.DATA_AFTER
	 * @return  the value of SYS_CHG_SYS_LOG.DATA_AFTER
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	public String getDataAfter() {
		return dataAfter;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_CHG_SYS_LOG.DATA_AFTER
	 * @param dataAfter  the value for SYS_CHG_SYS_LOG.DATA_AFTER
	 * @abatorgenerated  Mon Nov 18 14:42:22 CST 2013
	 */
	public void setDataAfter(String dataAfter) {
		this.dataAfter = dataAfter;
	}
}