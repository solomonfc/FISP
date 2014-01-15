package com.synesoft.fisp.app.dp.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.terasoluna.fw.common.exception.BusinessException;
import org.terasoluna.fw.common.message.ResultMessage;
import org.terasoluna.fw.common.message.ResultMessages;

import com.synesoft.fisp.app.common.constants.ContextConst;
import com.synesoft.fisp.app.common.utils.DateUtil;
import com.synesoft.fisp.app.dp.model.DepositBalanceForm;
import com.synesoft.fisp.app.dp.model.DepositBalanceForm.DP_02_06_Add;
import com.synesoft.fisp.domain.service.dp.DmDepositBalanceService;

/**
 * 
 * @author michelle.wang
 * 
 */

@Controller
@RequestMapping(value = "dp02")
public class DP_02_06Controller {
	private static final Logger logger = LoggerFactory
			.getLogger(DP_02_06Controller.class);

	@ModelAttribute
	public DepositBalanceForm setInfoUpForm() {
		return new DepositBalanceForm();
	}
	
	@RequestMapping("06/init")
	public String init(DepositBalanceForm form,
			BindingResult result, Model model) {
		logger.info("init...");
		form.getDepositBalance().setBranch(ContextConst.getOrgInfByUser().getBankid());
		form.getDepositBalance().setWorkDate(DateUtil.formatStringToDatePattern(ContextConst.getTipsConn().getCursysdate()));
		form.getDepositBalance().setRsv1("H");
		return "dp/DP_02_06";
	}

	@RequestMapping("06/add")
	public String add(@Validated({DP_02_06_Add.class}) DepositBalanceForm form,
			BindingResult result, Model model) {
		logger.info("start add ...");
		if (result.hasErrors()) {
			return "dp/DP_02_06";
		}
		BigDecimal rate=new BigDecimal(form.getInterestRate().replace("%", ""));
		rate=rate.divide(new BigDecimal("100"));
		form.setInterestRate(String.valueOf(rate));
		try {
			dmDepositBalanceService.transAdd(form);
		} catch (BusinessException e) {
			model.addAttribute("errmsg", e.getResultMessages());
			return "dp/DP_02_06";
		}
		
		model.addAttribute(
				"successmsg",
				ResultMessages.success().add(
						ResultMessage.fromCode("i.dp.0001")));
		return "dp/DP_02_06";
	}
	@Autowired
	private DmDepositBalanceService dmDepositBalanceService;

}
