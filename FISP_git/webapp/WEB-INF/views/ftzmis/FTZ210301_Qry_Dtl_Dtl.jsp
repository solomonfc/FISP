<!-- 6.3.1　代理发债（210301） / 查询 - 交易页面 -->
<!-- title -->
<div class="page_title"><spring:message code="ftzmis.title.210301.qry.txn"/></div>
<!-- body -->
<div class="row">
	<form:form id="form" action="${pageContext.request.contextPath}" method="post" modelAttribute="FTZ210301Form" class="form-horizontal">
		<form:hidden path="ftzOffTxnDtl.msgId" id="msgId"/>
		<table class="tbl_search">
			<tr>
				<td class="label_td"><spring:message code="ftz.label.SEQ_NO"/>：</td>
				<td><form:input path="ftzOffTxnDtl.seqNo" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.SUBMIT_DATE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.submitDate" type="text" class="input-large date" maxLength="10" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.TRAN_INSTITUTION_CODE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.institutionCode" type="text" class="input-large" maxLength="12" readonly="true"/></td>
		
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.ENT_ACCOUNT_NO"/>：</td>
				<td><form:input path="ftzOffTxnDtl.accountNo" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.BONDS_CODE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.bondsCode" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.BONDS_NAME"/>：</td>
				<td><form:input path="ftzOffTxnDtl.bondsName" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.CURRENCY"/>：</td>
				<td><form:input path="ftzOffTxnDtl.currency" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.ISSUE_AMOUNT"/>：</td>
				<td><t:moneyFormat type="text" id="amount" name="ftzOffTxnDtl.amount" value="${FTZ210301Form.ftzOffTxnDtl.amount }" format="###,###,###,###.00" dot="true" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.COUNTRY_CODE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.countryCode" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><spring:message code="ftz.label.DISTRICT_CODE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.districtCode" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.TRAN_TYPE"/>：</td>
				<td colspan="3">
					<form:select path="ftzOffTxnDtl.tranType" disabled="true">
						<option value=""></option>
						<form:options items="${FTZ_FUND_TRANSFER_TYPE }" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.TERM_UNIT"/>：</td>	
				<td>
					<form:select path="ftzOffTxnDtl.termUnit" disabled="true">
						<option value=""></option>
						<form:options items="${FTZ_REBUY_TERM_UNIT }" />
					</form:select>
				</td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.TERM_LENGTH"/>：</td>	
				<td><form:input path="ftzOffTxnDtl.termLength" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.SETTLE_DATE"/>：</td>	
				<td><form:input path="ftzOffTxnDtl.tranDate" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.EXPIRE_DATE"/>：</td>	
				<td><form:input path="ftzOffTxnDtl.expirationDate" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.INTEREST_TYPE"/>：</td>	
				<td>
					<form:select path="ftzOffTxnDtl.interestType" disabled="true">
						<option value=""></option>
						<form:options items="${FTZ_INTEREST_TYPE }" />
					</form:select>
				</td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.FIXED_INTEREST_RATES"/>：</td>
				<td><form:input path="ftzOffTxnDtl.interestRate" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr>	
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.BENCHMARK"/>：</td>
				<td>
					<form:select path="ftzOffTxnDtl.benchmark" disabled="true">
						<option value=""></option>
						<form:options items="${FTZ_BENCHMARK }" />
					</form:select>
				</td>
				
				<td class="label_td"><font color="red">*</font><spring:message code="ftz.label.FLOAT_RATE"/>：</td>
				<td><form:input path="ftzOffTxnDtl.floatRate" type="text" class="input-large" readonly="true"/></td>
			</tr>
			<tr class="dtl"><td colspan="4"><hr/></td><td>
			<tr class="dtl">	
				<td class="label_td"><spring:message code="ftz.label.DTL_STATUS"/>：</td>
				<td colspan="3"><t:codeValue items="${FTZ_MSG_STATUS }" key="${FTZ210301Form.ftzOffTxnDtl.chkStatus }" type="text"  cssClass="input-large" readonly="true"/></td>
			</tr>
			<tr class="dtl">	
				<td class="label_td"><spring:message code="ftz.label.MAK_USER_ID"/>：</td>
				<td><form:input path="ftzOffTxnDtl.makUserId" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><spring:message code="ftz.label.MAK_DATETIME"/>：</td>
				<td><t:dateTimeFormat type="text" value="${FTZ210301Form.ftzOffTxnDtl.makDatetime }" format="datetime" name="ftzOffTxnDtl.makDatetime" cssClass="input-large" readonly="true"/></td>
			</tr>
			<tr class="dtl">	
				<td class="label_td"><spring:message code="ftz.label.CHK_USER_ID"/>：</td>
				<td><form:input path="ftzOffTxnDtl.chkUserId" type="text" class="input-large" readonly="true"/></td>
				
				<td class="label_td"><spring:message code="ftz.label.CHK_DATETIME"/>：</td>
				<td><t:dateTimeFormat type="text" value="${FTZ210301Form.ftzOffTxnDtl.chkDatetime }" format="datetime" name="ftzOffTxnDtl.chkDatetime" cssClass="input-large" readonly="true"/></td>
			</tr>
			<tr class="dtl">	
				<td class="label_td"><spring:message code="ftz.label.CHK_ADD_WORD"/>：</td>
				<td colspan="3"><form:input path="ftzOffTxnDtl.chkAddWord" type="text" class="input-xxlarge" readonly="true"/></td>
			</tr>
	    </table>											
	</form:form>
</div>
<div class="row">
	<div class="navbar navbar-fixed-bottom text-right" id="footer" style="text-align:center; margin-bottom:0px; line-height:30px; background-color: #eee; opacity:0.9;">
		<button id="cls" name="btn" class="btn btn-primary" onclick="javascript: window.close();"><spring:message code="ftz.label.CLOSE"/></button>
	</div>
</div>