package com.synesoft.ftzmis.domain.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.terasoluna.fw.common.exception.BusinessException;
import org.terasoluna.fw.common.message.ResultMessage;
import org.terasoluna.fw.common.message.ResultMessages;

import com.synesoft.fisp.app.common.utils.StringUtil;
import com.synesoft.fisp.domain.repository.sm.OrgInfRepository;
import com.synesoft.ftzmis.app.common.constants.CommonConst;
import com.synesoft.ftzmis.app.common.util.DateUtil;
import com.synesoft.ftzmis.app.common.util.Validator;
import com.synesoft.ftzmis.domain.model.FtzOffMsgCtl;
import com.synesoft.ftzmis.domain.model.FtzOffTxnDtl;

/**
 * 6.3.4　信用证保兑（210304） - 进口应付
 * @author yyw
 * @date 2014-01-06
 */
@Service("ftz210304Service")
public class FTZ210304ServiceImp extends FTZOffCommonServiceImp {
	private static final Logger log = LoggerFactory.getLogger(FTZ210304ServiceImp.class);
	
	private String msgNo;

	public FTZ210304ServiceImp() {
		super.funcId = CommonConst.FUNCTION_FTZ_Add_210304;
		msgNo = CommonConst.MSG_NO_210304;
	}
	
	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonService#addMsgLogic(com.synesoft.ftzmis.domain.model.FtzOffMsgCtl)
	 */
	public void addMsgLogic(FtzOffMsgCtl ftzOffMsgCtl) {
		log.debug("FTZ210304ServiceImp.addMsgLogic() start ...");

		ftzOffMsgCtl.setMsgNo(msgNo);
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#updateMsgLogic(com.synesoft.ftzmis.domain.model.FtzOffMsgCtl)
	 */
	protected void updateMsgLogic(FtzOffMsgCtl ftzOffMsgCtl) {
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#addTxnLogic(com.synesoft.ftzmis.domain.model.FtzOffTxnDtl)
	 */
	protected void addTxnLogic(FtzOffTxnDtl ftzOffTxnDtl) {
		log.debug("FTZ210304ServiceImp.addTxnLogic() start ...");

		ResultMessages messages = ResultMessages.error();

		String countryCode = ftzOffTxnDtl.getCountryCode();
		String districtCode = ftzOffTxnDtl.getDistrictCode();
		// 对方机构为境外机构时，国内地区码必填
		if (!Validator.CheckDistrictCode(countryCode, districtCode)) {
			log.error("[e.ftzmis.210304.0010] ApplicantDistrictCode cannot be empty!"); 
			messages.add("e.ftzmis.210304.0010");								
			throw new BusinessException(messages);
		}

		// 校验所属机构代码是否为本行机构
		String accOrgCode = StringUtil.trim(ftzOffTxnDtl.getAccOrgCode());
		if (!Validator.CheckAccOrgCode(orgInfRepository, accOrgCode)) {
			log.error("[e.ftzmis.210304.0011] AccOrgCode is not belong to this bank!"); 
			messages.add("e.ftzmis.210304.0011");								
			throw new BusinessException(messages);
		}

		// 校验金额
		BigDecimal amount = ftzOffTxnDtl.getAmount();
		if (!Validator.CheckAmount(amount)) {
			log.error("[e.ftzmis.210304.0012] The format of amount is wrong!"); 
			messages.add("e.ftzmis.210304.0012");								
			throw new BusinessException(messages);
		}
		
		ftzOffTxnDtl.setReportCode(msgNo);
		ftzOffTxnDtl.setSubmitDate(DateUtil.getFormatDateRemoveSprit(ftzOffTxnDtl.getSubmitDate()));
		ftzOffTxnDtl.setExpirationDate(DateUtil.getFormatDateRemoveSprit(ftzOffTxnDtl.getExpirationDate()));
		ftzOffTxnDtl.setCountryCode(countryCode);
		ftzOffTxnDtl.setDistrictCode(districtCode);
		ftzOffTxnDtl.setAccOrgCode(accOrgCode);
		ftzOffTxnDtl.setInstitutionCode(StringUtil.trim(ftzOffTxnDtl.getInstitutionCode()));
		ftzOffTxnDtl.setSwiftCode(StringUtil.trim(ftzOffTxnDtl.getSwiftCode()));
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#updateTxnLogic(com.synesoft.ftzmis.domain.model.FtzOffTxnDtl)
	 */
	protected void updateTxnLogic(FtzOffTxnDtl ftzOffTxnDtl) {
		log.debug("FTZ210304ServiceImp.updateTxnLogic() start ...");

		ResultMessages messages = ResultMessages.error();

		String countryCode = ftzOffTxnDtl.getCountryCode();
		String districtCode = ftzOffTxnDtl.getDistrictCode();
		// 对方机构为境外机构时，国内地区码必填
		if (!Validator.CheckDistrictCode(countryCode, districtCode)) {
			log.error("[e.ftzmis.210304.0010] ApplicantDistrictCode cannot be empty!"); 
			messages.add("e.ftzmis.210304.0010");								
			throw new BusinessException(messages);
		}

		// 校验所属机构代码是否为本行机构
		String accOrgCode = StringUtil.trim(ftzOffTxnDtl.getAccOrgCode());
		if (!Validator.CheckAccOrgCode(orgInfRepository, accOrgCode)) {
			log.error("[e.ftzmis.210304.0011] AccOrgCode is not belong to this bank!"); 
			messages.add("e.ftzmis.210304.0011");								
			throw new BusinessException(messages);
		}

		// 校验金额
		BigDecimal amount = ftzOffTxnDtl.getAmount();
		if (!Validator.CheckAmount(amount)) {
			log.error("[e.ftzmis.210304.0012] The format of amount is wrong!"); 
			messages.add("e.ftzmis.210304.0012");								
			throw new BusinessException(messages);
		}
		
		ftzOffTxnDtl.setMakDatetime(DateUtil.getFormatDateTimeRemoveSpritAndColon(ftzOffTxnDtl.getMakDatetime()));
		ftzOffTxnDtl.setChkDatetime(DateUtil.getFormatDateTimeRemoveSpritAndColon(ftzOffTxnDtl.getChkDatetime()));
		ftzOffTxnDtl.setCountryCode(countryCode);
		ftzOffTxnDtl.setDistrictCode(districtCode);
		ftzOffTxnDtl.setAccOrgCode(accOrgCode);
		ftzOffTxnDtl.setInstitutionCode(StringUtil.trim(ftzOffTxnDtl.getInstitutionCode()));
		ftzOffTxnDtl.setSwiftCode(StringUtil.trim(ftzOffTxnDtl.getSwiftCode()));
		ftzOffTxnDtl.setSubmitDate(DateUtil.getFormatDateRemoveSprit(ftzOffTxnDtl.getSubmitDate()));
		ftzOffTxnDtl.setExpirationDate(DateUtil.getFormatDateRemoveSprit(ftzOffTxnDtl.getExpirationDate()));
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#deleteMsgLogic(com.synesoft.ftzmis.domain.model.FtzOffMsgCtl)
	 */
	@Override
	protected void deleteMsgLogic(FtzOffMsgCtl ftzOffMsgCtl) {
		log.debug("FTZ210304ServiceImp.deleteMsgLogic() start ...");
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#deleteTxnLogic(com.synesoft.ftzmis.domain.model.FtzOffTxnDtl)
	 */
	@Override
	protected void deleteTxnLogic(FtzOffTxnDtl ftzOffTxnDtl) {
		log.debug("FTZ210304ServiceImp.deleteTxnLogic() start ...");
	}

	/* (non-Javadoc)
	 * @see com.synesoft.ftzmis.domain.service.FTZOffCommonServiceImp#validateTxn(com.synesoft.ftzmis.domain.model.FtzOffTxnDtl)
	 */
	@Override
	protected void validateTxn(FtzOffTxnDtl ftzOffTxnDtl) {
		log.debug("FTZ210304ServiceImp.validateTxn() start ...");

		ResultMessages messages = ResultMessages.error();
		// 申报日期
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getSubmitDate())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0001");	
			messages.addAll(msg);
		}
		// 所属机构代码
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getAccOrgCode())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0002");								
			messages.addAll(msg);
		}
		// 金额
		if (ftzOffTxnDtl.getAmount() == null) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0003");								
			messages.addAll(msg);
		}
		// 货币
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getCurrency())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0004");								
			messages.addAll(msg);
		}
		// 境内外对手行代码
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getSwiftCode())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0005");								
			messages.addAll(msg);
		}
		// 申请人企业名称
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getAccountName())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0006");								
			messages.addAll(msg);
		}
		// 申请人企业机构代码
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getInstitutionCode())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0007");								
			messages.addAll(msg);
		}
		// 申请人国别代码
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getCountryCode())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0008");								
			messages.addAll(msg);
		}
		// 保兑到期日
		if (!StringUtil.isNotTrimEmpty(ftzOffTxnDtl.getExpirationDate())) {
			ResultMessage msg = ResultMessage.fromCode("e.ftzmis.210304.0009");								
			messages.addAll(msg);
		}
		if (messages.isNotEmpty()) {
			throw new BusinessException(messages);
		}
		
	}

	@Autowired
	protected OrgInfRepository orgInfRepository;
	
}
