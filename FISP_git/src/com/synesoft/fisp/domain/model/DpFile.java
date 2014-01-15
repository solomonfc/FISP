package com.synesoft.fisp.domain.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.synesoft.fisp.app.common.validation.FileNameRule;
import com.synesoft.fisp.app.common.validation.NotEmptyEx;
import com.synesoft.fisp.app.dp.model.DpFileAddForm.DpFileAddFormAdd;
import com.synesoft.fisp.app.dp.model.DpFileDtlForm.DpFileDtlFormInit;
import com.synesoft.fisp.app.dp.model.DpFileMdfForm.DpFileMdfFormInit;
import com.synesoft.fisp.app.dp.model.DpFileMdfForm.DpFileMdfFormMdf;
import com.synesoft.fisp.app.dp.model.DpFileQryForm.DpFileQryFormDel;

public class DpFile {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.FILE_ID
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @NotEmpty(groups = {DpFileDtlFormInit.class, DpFileQryFormDel.class,  
    		DpFileMdfFormInit.class, DpFileMdfFormMdf.class }, message = "{e.dp.file.0040}")
    private String fileId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.FILE_NAME
     * 
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @NotEmpty(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, message = "{e.dp.file.0049}")
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=128, message = "{e.dp.imp.0068}")
    @FileNameRule(groups = {DpFileAddFormAdd.class }, message = "{e.dp.file.0084}")
    private String fileName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.FILE_TYPE
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @NotEmptyEx(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, message ="{e.dp.file.0050}")
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=1, message = "{e.dp.file.0072}")
    private String fileType;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.DELIMITER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=20, message = "{e.dp.file.0073}")
    private String delimiter;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.FIXED_LEN_CFG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=1024, message = "{e.dp.file.0074}")
    private String fixedLenCfg;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.FILE_ENCODING
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @NotEmptyEx(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, message ="{e.dp.file.0059}")
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=20, message = "{e.dp.file.0075}")
    private String fileEncoding;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.SROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Max(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, value = 999999, message = "{e.dp.file.0076}")
    private Integer srowIgnrNum;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.EROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Max(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, value = 999999, message = "{e.dp.file.0077}")
    private Integer erowIgnrNum;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.SHEET_NO
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Max(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, value = 999999, message = "{e.dp.file.0078}")
    private Integer sheetNo;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.START_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Max(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, value = 999999, message = "{e.dp.file.0079}")
    private Integer startColumn;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.END_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Max(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, value = 999999, message = "{e.dp.file.0080}")
    private Integer endColumn;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.COMMIT_COUNT
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private Long commitCount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.IO_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=1, message = "{e.dp.file.0081}")
    private String ioFlag;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.CUT_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=1, message = "{e.dp.file.0082}")
    private String cutFlag;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.COMMENTS
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    @Size(groups = {DpFileAddFormAdd.class, DpFileMdfFormMdf.class }, min=0, max=255, message = "{e.dp.imp.0071}")
    private String comments;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.CREATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String createTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.CREATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String createUser;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.UPDATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String updateTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.UPDATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String updateUser;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.RSV1
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String rsv1;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.RSV2
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String rsv2;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.RSV3
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String rsv3;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.RSV4
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String rsv4;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column DP_FILE.RSV5
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    private String rsv5;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.FILE_ID
     *
     * @return the value of DP_FILE.FILE_ID
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.FILE_ID
     *
     * @param fileId the value for DP_FILE.FILE_ID
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.FILE_NAME
     *
     * @return the value of DP_FILE.FILE_NAME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.FILE_NAME
     *
     * @param fileName the value for DP_FILE.FILE_NAME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.FILE_TYPE
     *
     * @return the value of DP_FILE.FILE_TYPE
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.FILE_TYPE
     *
     * @param fileType the value for DP_FILE.FILE_TYPE
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.DELIMITER
     *
     * @return the value of DP_FILE.DELIMITER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.DELIMITER
     *
     * @param delimiter the value for DP_FILE.DELIMITER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.FIXED_LEN_CFG
     *
     * @return the value of DP_FILE.FIXED_LEN_CFG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getFixedLenCfg() {
        return fixedLenCfg;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.FIXED_LEN_CFG
     *
     * @param fixedLenCfg the value for DP_FILE.FIXED_LEN_CFG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setFixedLenCfg(String fixedLenCfg) {
        this.fixedLenCfg = fixedLenCfg;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.FILE_ENCODING
     *
     * @return the value of DP_FILE.FILE_ENCODING
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getFileEncoding() {
        return fileEncoding;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.FILE_ENCODING
     *
     * @param fileEncoding the value for DP_FILE.FILE_ENCODING
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.SROW_IGNR_NUM
     *
     * @return the value of DP_FILE.SROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Integer getSrowIgnrNum() {
        return srowIgnrNum;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.SROW_IGNR_NUM
     *
     * @param srowIgnrNum the value for DP_FILE.SROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setSrowIgnrNum(Integer srowIgnrNum) {
        this.srowIgnrNum = srowIgnrNum;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.EROW_IGNR_NUM
     *
     * @return the value of DP_FILE.EROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Integer getErowIgnrNum() {
        return erowIgnrNum;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.EROW_IGNR_NUM
     *
     * @param erowIgnrNum the value for DP_FILE.EROW_IGNR_NUM
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setErowIgnrNum(Integer erowIgnrNum) {
        this.erowIgnrNum = erowIgnrNum;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.SHEET_NO
     *
     * @return the value of DP_FILE.SHEET_NO
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Integer getSheetNo() {
        return sheetNo;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.SHEET_NO
     *
     * @param sheetNo the value for DP_FILE.SHEET_NO
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setSheetNo(Integer sheetNo) {
        this.sheetNo = sheetNo;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.START_COLUMN
     *
     * @return the value of DP_FILE.START_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Integer getStartColumn() {
        return startColumn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.START_COLUMN
     *
     * @param startColumn the value for DP_FILE.START_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.END_COLUMN
     *
     * @return the value of DP_FILE.END_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.END_COLUMN
     *
     * @param endColumn the value for DP_FILE.END_COLUMN
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.COMMIT_COUNT
     *
     * @return the value of DP_FILE.COMMIT_COUNT
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public Long getCommitCount() {
        return commitCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.COMMIT_COUNT
     *
     * @param commitCount the value for DP_FILE.COMMIT_COUNT
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setCommitCount(Long commitCount) {
        this.commitCount = commitCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.IO_FLAG
     *
     * @return the value of DP_FILE.IO_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getIoFlag() {
        return ioFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.IO_FLAG
     *
     * @param ioFlag the value for DP_FILE.IO_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setIoFlag(String ioFlag) {
        this.ioFlag = ioFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.CUT_FLAG
     *
     * @return the value of DP_FILE.CUT_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getCutFlag() {
        return cutFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.CUT_FLAG
     *
     * @param cutFlag the value for DP_FILE.CUT_FLAG
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setCutFlag(String cutFlag) {
        this.cutFlag = cutFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.COMMENTS
     *
     * @return the value of DP_FILE.COMMENTS
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.COMMENTS
     *
     * @param comments the value for DP_FILE.COMMENTS
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.CREATE_TIME
     *
     * @return the value of DP_FILE.CREATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.CREATE_TIME
     *
     * @param createTime the value for DP_FILE.CREATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.CREATE_USER
     *
     * @return the value of DP_FILE.CREATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.CREATE_USER
     *
     * @param createUser the value for DP_FILE.CREATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.UPDATE_TIME
     *
     * @return the value of DP_FILE.UPDATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.UPDATE_TIME
     *
     * @param updateTime the value for DP_FILE.UPDATE_TIME
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.UPDATE_USER
     *
     * @return the value of DP_FILE.UPDATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.UPDATE_USER
     *
     * @param updateUser the value for DP_FILE.UPDATE_USER
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.RSV1
     *
     * @return the value of DP_FILE.RSV1
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getRsv1() {
        return rsv1;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.RSV1
     *
     * @param rsv1 the value for DP_FILE.RSV1
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.RSV2
     *
     * @return the value of DP_FILE.RSV2
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getRsv2() {
        return rsv2;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.RSV2
     *
     * @param rsv2 the value for DP_FILE.RSV2
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.RSV3
     *
     * @return the value of DP_FILE.RSV3
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getRsv3() {
        return rsv3;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.RSV3
     *
     * @param rsv3 the value for DP_FILE.RSV3
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.RSV4
     *
     * @return the value of DP_FILE.RSV4
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getRsv4() {
        return rsv4;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.RSV4
     *
     * @param rsv4 the value for DP_FILE.RSV4
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column DP_FILE.RSV5
     *
     * @return the value of DP_FILE.RSV5
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public String getRsv5() {
        return rsv5;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column DP_FILE.RSV5
     *
     * @param rsv5 the value for DP_FILE.RSV5
     *
     * @abatorgenerated Tue Nov 12 10:03:54 CST 2013
     */
    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5;
    }
}