package com.synesoft.fisp.app.bp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.terasoluna.fw.common.exception.BusinessException;
import org.terasoluna.fw.common.message.ResultMessage;
import org.terasoluna.fw.common.message.ResultMessages;

import com.synesoft.fisp.app.dp.model.LoanBalanceForm;
import com.synesoft.fisp.domain.model.DmLoanBalance;
import com.synesoft.fisp.domain.service.dp.DmLoanBalanceService;

/**
 * 
 * @author michelle.wang
 * 
 */

@Controller
@RequestMapping(value = "bp06")
public class BP_06_05Controller {
	private static final Logger logger = LoggerFactory
			.getLogger(BP_06_05Controller.class);
	
	@ModelAttribute
	public LoanBalanceForm setUpForm() {
		return new LoanBalanceForm();
	}

	@RequestMapping("05/detailSearch")
	public String detailSearch_01(LoanBalanceForm form,
			BindingResult result, Model model) {
		logger.info("detailSearch...");
		DmLoanBalance loanBalance=form.getLoanBalance();
		loanBalance=dmLoanBalanceService.transQueryDmLoanBalance(loanBalance);
		form.setLoanBalance(loanBalance);
		return "bp/BP_06_05";
	}
	
	@RequestMapping("05/auth")
	public String auth(LoanBalanceForm form,
			BindingResult result, Model model){
		logger.info("start auth ...");
		if (result.hasErrors()) {
			return "bp/BP_06_05";
		}
		try {
			dmLoanBalanceService.transAuth(form);
		} catch (BusinessException e) {
			model.addAttribute("errmsg", e.getResultMessages());
			return "bp/BP_06_05";
		}
		model.addAttribute(
				"successmsg",
				ResultMessages.success().add(
						ResultMessage.fromCode("i.dp.0004")));
		return "bp/BP_06_05";
	}
	
	@RequestMapping("05/reject")
	public String reject(LoanBalanceForm form,
	BindingResult result, Model model) {
		logger.info("start reject ...");
		if (result.hasErrors()) {
			return "bp/BP_06_05";
		}
		try {
			dmLoanBalanceService.transReject(form);
		} catch (BusinessException e) {
			model.addAttribute("errmsg", e.getResultMessages());
			return "bp/BP_06_05";
		}
		model.addAttribute(
				"successmsg",
				ResultMessages.success().add(
						ResultMessage.fromCode("i.dp.0005")));
		return "bp/BP_06_05";
	}
	@RequestMapping("05/cancel")
	public String cancel(LoanBalanceForm form,
	BindingResult result, Model model) {
		logger.info("start reject ...");
		if (result.hasErrors()) {
			return "bp/BP_06_05";
		}
		try {
			dmLoanBalanceService.transCancel(form);
		} catch (BusinessException e) {
			model.addAttribute("errmsg", e.getResultMessages());
			return "bp/BP_06_05";
		}
		model.addAttribute(
				"successmsg",
				ResultMessages.success().add(
						ResultMessage.fromCode("i.dp.0005")));
		return "bp/BP_06_05";
	}
	
	@Autowired
	private DmLoanBalanceService dmLoanBalanceService;

}
