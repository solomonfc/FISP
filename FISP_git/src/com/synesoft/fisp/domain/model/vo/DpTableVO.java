package com.synesoft.fisp.domain.model.vo;

import com.synesoft.fisp.domain.model.DpTable;

public class DpTableVO extends DpTable {
    
	private String oldUpdateTime;
    private String oldUpdateUser;
	/**
	 * @return the oldUpdateTime
	 */
	public String getOldUpdateTime() {
		return oldUpdateTime;
	}
	/**
	 * @param oldUpdateTime the oldUpdateTime to set
	 */
	public void setOldUpdateTime(String oldUpdateTime) {
		this.oldUpdateTime = oldUpdateTime;
	}
	/**
	 * @return the oldUpdateUser
	 */
	public String getOldUpdateUser() {
		return oldUpdateUser;
	}
	/**
	 * @param oldUpdateUser the oldUpdateUser to set
	 */
	public void setOldUpdateUser(String oldUpdateUser) {
		this.oldUpdateUser = oldUpdateUser;
	}


}