<script type="text/javascript">
	$(function() {
		$("#pageTable").find("tr").bind('click', function() {
			var selected_msgId = $(this).find("td:eq(8)").text();
			var selected_seqNo = $(this).find("td:eq(9)").text();
			var old_selected_msgId = $("#selected_msgId").val();
			var old_selected_seqNo = $("#selected_seqNo").val();
			if (null == old_selected_seqNo) {
				$("#selected_msgId").val(selected_msgId);
				$("#selected_seqNo").val(selected_seqNo);
				return;
			}
			if (old_selected_seqNo == selected_seqNo) {
				$("#selected_msgId").val("");
				$("#selected_seqNo").val("");
				return;
			}
			if (old_selected_seqNo != selected_seqNo) {
				$("#selected_msgId").val(selected_msgId);
				$("#selected_seqNo").val(selected_seqNo);
				return;
			}

		});
		$("#pageTable").find("tr").bind('dblclick', function() {
			var selected_msgId = $(this).find("td:eq(8)").text();
			var selected_seqNo = $(this).find("td:eq(9)").text();
			window.showModalDialog(
					'${pageContext.request.contextPath}/FTZMsgResend/QryDtlDtl?selected_msgId='
						+ selected_msgId + "&selected_seqNo=" + selected_seqNo,
					window,
					'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
		});
	});
	function showDetaildetail() {
		var selected_msgId = $("#selected_msgId").val();
		var selected_seqNo = $("#selected_seqNo").val();
		if (null == selected_seqNo || "" == selected_seqNo) {
			alert("请选择一条明细数据！");
			return;
		} else {
			window.showModalDialog(
				'${pageContext.request.contextPath}/FTZMsgResend/QryDtlDtl?selected_msgId='
				+ selected_msgId + "&selected_seqNo=" + selected_seqNo,
				window,
				'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
		}
	}

	function queryFTZMsgResendDtl() {
		$("#selected_msgId").val($("#msgId").val());
		var form = document.getElementById("form");
		form.action = "${pageContext.request.contextPath}/FTZMsgResend/QryDtl";
		form.submit();
	}
</script>

<div id="id_showMsg" style="display: none">
	<br /> <br />
	<div class="alert alert-error" id="errorMsg" style="display: none"></div>
	<div id="id_result">
		<t:messagePanel />
		<spring:hasBindErrors name="FTZMsgResendForm">
			<form:form commandName="FTZMsgResendForm">
				<div class="alert alert-error">
					<form:errors path="*" cssStyle="color:red"></form:errors>
				</div>
			</form:form>
		</spring:hasBindErrors>
	</div>
	<br />
</div>

<div class="page_title"><spring:message code="ftzmis.title.MsgResend.qry.dtl" /></div>

<div class="row">
	<form:form id="form"
		action="${pageContext.request.contextPath}/FTZMsgResend/Qry"
		method="post" modelAttribute="FTZMsgResendForm" class="form-horizontal">
		<form:hidden path="selected_msgId" id="selected_msgId" />
		<form:hidden path="selected_seqNo" id="selected_seqNo"/>
		<table class="tbl_search">
			<tr>
				<td class="label_td"><spring:message code="ftz.label.BRANCH" />：</td>
				<td><form:select path="ftzInMsgCtl.branchId" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${SM_0002}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.MSG_ID" />：</td>
				<td><form:input id="msgId" path="ftzInMsgCtl.msgId"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.SUBMIT_DATE" />：</td>
				<td><form:input id="submitDate" path="ftzInMsgCtl.submitDate"
						class=".input-large" readonly="true" /></td>
				<td class="label_td"><spring:message code="ftz.label.MSG_STATUS" />：</td>
				<td><form:select path="ftzInMsgCtl.msgStatus" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_MSG_STATUS}" />
					</form:select></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.ACCOUNT_NO" />：</td>
				<td><form:input id="accountNo" path="ftzInMsgCtl.accountNo"
						class=".input-large" readonly="true" /></td>
				<td class="label_td"><spring:message code="ftz.label.SUB_ACCOUNT_NO" />：</td>
				<td><form:input id="subAccountNo"
						path="ftzInMsgCtl.subAccountNo" class=".input-large"
						readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.ACC_TYPE" />：</td>
				<td><form:select path="ftzInMsgCtl.accType" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_ACC_TYPE}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.ACCOUNT_NAME" />：</td>
				<td><form:input id="accountName" path="ftzInMsgCtl.accountName"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.DEPOSIT_RATE" />：</td>
				<td><t:moneyFormat type="text"
						value="${FTZMsgResendForm.ftzInMsgCtl.depositRate}"
						format="###.000000" dot="true" readonly="true" /></td>

				<td class="label_td"><spring:message code="ftz.label.CUSTOM_TYPE" />：</td>
				<td><form:select path="ftzInMsgCtl.customType" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_CUSTOM_TYPE}" />
					</form:select></td>
			</tr>
			<tr>
				<td colspan="2" class="label_td"><spring:message code="ftz.label.BALANCE_CODE" />：<form:select path="ftzInMsgCtl.balanceCode" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_BALANCE_INDEX_CODE}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.DOCUMENT_TYPE" />：</td>
				<td><form:select path="ftzInMsgCtl.documentType"
						disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_DOCUMENT_TYPE}" />
					</form:select></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.CURRENCY" />：</td>
				<td><form:select path="ftzInMsgCtl.currency" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${SYS_CURRENCY}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.DOCUMENT_NO" />：</td>
				<td><form:input id="documentNo" path="ftzInMsgCtl.documentNo"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.DAILY_BALANCE" />：</td>
				<td><t:moneyFormat type="text"
						value="${FTZMsgResendForm.ftzInMsgCtl.balance}"
						format="###,###,###,###.00" dot="true" readonly="true" /></td>
				<td class="label_td"><spring:message code="ftz.label.ACC_ORG_CODE" />：</td>
				<td><form:input id="accOrgCode" path="ftzInMsgCtl.accOrgCode"
						class=".input-large" readonly="true" /></td>
			</tr>
			</table>
			<table class="tbl_search">
			<tr>
				<td class="label_td"><spring:message code="ftz.label.SND_DATETIME" />：</td>
				<td><form:input id="sndDatetime" path="ftzInMsgCtl.sndDatetime"
						class=".input-large" readonly="true" /></td>
				<td class="label_td"><spring:message code="ftz.label.ACK_DATETIME" />：</td>
				<td><form:input id="ackDatetime" path="ftzInMsgCtl.ackDatetime"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.PBOC_STATUS" />：</td>
				<td colspan="3"><form:select path="ftzInMsgCtl.result"
						disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_PROC_RESULT}" />
					</form:select></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.ADDWORD" />：</td>
				<td colspan="3"><form:input id="addWord"
						path="ftzInMsgCtl.addWord" class="input-xxlarge" readonly="true" /></td>
			</tr>
			</table>

	</form:form>
</div>

<div class="row">
	<div class="tbl_page_head">
		<table
			class="table table-striped table-bordered table-condensed tbl_page">
			<thead>
				<p class="text-info" align="center"><spring:message code="ftz.label.MSG_DTL_List" /></p>
				<tr>
					<th style="vertical-align: middle; text-align: center" width="10px"><spring:message code="fisp.label.common.no" /></th>
					<th style="vertical-align: middle; text-align: center" width="40px"><spring:message code="ftz.label.CD_FLAG" /></th>
					<th style="vertical-align: middle; text-align: center" width="40px"><spring:message code="ftz.label.TRAN_DATE" /></th>
					<th style="vertical-align: middle; text-align: center" width="90px"><spring:message code="ftz.label.AMOUNT" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message code="ftz.label.COUNTRY_CODE" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message code="ftz.label.OPP_BANK_CODE1" /></th>
					<th style="vertical-align: middle; text-align: center"
						width="150px"><spring:message code="ftz.label.OPP_NAME1" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message code="ftz.label.DTL_STATUS" /></th>
				</tr>
			</thead>
		</table>
	</div>
	<div class="tbl_page_body" style="min-height: 340px; height: 340px;">
		<table id="pageTable"
			class="table table-striped table-bordered table-condensed tbl_page"
			style="border: 0">
			<tbody>
				<c:forEach var="dto1" items="${page.content}" varStatus="i">
					<tr>
						<td style="text-align: center; width: 10px;">${(page.number*page.size)+(i.index+1)}</td>
						<td class="vtip" style="text-align: left; width: 40px;"><t:codeValue
								items="${FTZ_CD_FLAG}" key="${dto1.cdFlag}" type="label" /></td>
						<td class="vtip" style="text-align: left; width: 40px;">${dto1.tranDate}</td>
						<td class="vtip" style="text-align: right; width: 90px;"><t:moneyFormat
								type="label" value="${dto1.amount}" /></td>
						<td class="vtip" style="text-align: left; width: 50px;"><t:codeValue
								items="${FTZ_COUNTRY_CODE}" key="${dto1.countryCode}" type="label" /></td>
						<td class="vtip" style="text-align: left; width: 50px;">${dto1.oppBankCode}</td>
						<td class="vtip" style="text-align: left; width: 150px;">${dto1.oppName}</td>
						<td class="vtip" style="text-align: left; width: 50px;"><t:codeValue
								items="${FTZ_MSG_STATUS}" key="${dto1.chkStatus}" type="label" />
						</td>
						<td style="display: none;">${dto1.msgId}</td>
						<td style="display: none;">${dto1.seqNo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<div class="pagination pull-right" style="margin-top: 10px;">
	<div class="rightPage">
		<util:pagination page="${page}"
			query="selected_msgId=${FTZMsgResendForm.ftzInMsgCtl.msgId}" />
	</div>
</div>
<div class="row" style="margin-bottom: 40px;">
	<div class="navbar navbar-fixed-bottom text-center" id="footer"
		style="margin-bottom: 0px; line-height: 30px; background-color: #eee; opacity: 0.9;">
		<input id="turnModify" type="button" class="btn btn-primary"
			onclick="turnModify();" value="<spring:message code="ftz.label.MSG_TURN_MODIFY"/>">
		<input id="resend" type="button" class="btn btn-primary"
			onclick="resend();" value="<spring:message code="ftz.label.MSG_RESEND"/>">
		<input id="detaildetail" type="button" class="btn btn-primary"
			onclick="showDetaildetail();" value="<spring:message code="ftz.label.DTL_DTL"/>"> 
		<input type="button" class="btn btn-primary" onclick="javascript:window.close();"
			value="<spring:message code="button.lable.close"/>">
	</div>
</div>