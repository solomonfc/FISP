package com.synesoft.sysrunner.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class BatMachine {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column BAT_MACHINE.MACHINE_ID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    private Short machineId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column BAT_MACHINE.MACHINE_TYPE
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    private String machineType;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column BAT_MACHINE.PID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    private BigDecimal pid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column BAT_MACHINE.MACHINE_NOW
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    private Date machineNow;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column BAT_MACHINE.MACHINE_ID
     *
     * @return the value of BAT_MACHINE.MACHINE_ID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public Short getMachineId() {
        return machineId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column BAT_MACHINE.MACHINE_ID
     *
     * @param machineId the value for BAT_MACHINE.MACHINE_ID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public void setMachineId(Short machineId) {
        this.machineId = machineId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column BAT_MACHINE.MACHINE_TYPE
     *
     * @return the value of BAT_MACHINE.MACHINE_TYPE
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column BAT_MACHINE.MACHINE_TYPE
     *
     * @param machineType the value for BAT_MACHINE.MACHINE_TYPE
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column BAT_MACHINE.PID
     *
     * @return the value of BAT_MACHINE.PID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public BigDecimal getPid() {
        return pid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column BAT_MACHINE.PID
     *
     * @param pid the value for BAT_MACHINE.PID
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column BAT_MACHINE.MACHINE_NOW
     *
     * @return the value of BAT_MACHINE.MACHINE_NOW
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public Date getMachineNow() {
        return machineNow;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column BAT_MACHINE.MACHINE_NOW
     *
     * @param machineNow the value for BAT_MACHINE.MACHINE_NOW
     *
     * @abatorgenerated Thu Dec 05 17:02:48 CST 2013
     */
    public void setMachineNow(Date machineNow) {
        this.machineNow = machineNow;
    }
}