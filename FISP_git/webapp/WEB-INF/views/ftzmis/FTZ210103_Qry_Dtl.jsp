<script type="text/javascript">
	$(function() {
		$("#pageTable").find("tr").bind('click', function() {
			var selected_msgId = $(this).find("td:eq(10)").text();
			var selected_seqNo = $(this).find("td:eq(11)").text();
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
		$("#pageTable").find("tr").bind(
				'dblclick',
				function() {
					var selected_msgId = $(this).find("td:eq(10)").text();
					var selected_seqNo = $(this).find("td:eq(11)").text();
					showDialog(
							'${pageContext.request.contextPath}/FTZ210103/QryDtlDtl?selected_msgId='
									+ selected_msgId + "&selected_seqNo="
									+ selected_seqNo, '500', '1024');
				});
	});
	function showDetaildetail() {
		var selected_msgId = $("#selected_msgId").val();
		var selected_seqNo = $("#selected_seqNo").val();
		if (null == selected_seqNo || "" == selected_seqNo) {
			alert('<spring:message code="ftz.validate.choose.dataTxn"/>');
			return;
		} else {
			showDialog(
					'${pageContext.request.contextPath}/FTZ210103/QryDtlDtl?selected_msgId='
							+ selected_msgId + "&selected_seqNo="
							+ selected_seqNo, '500', '1024');
		}
	}

	function queryFTZ210103Dtl() {
		$("#selected_msgId").val($("#msgId").val());
		var form = document.getElementById("form");
		form.action = "${pageContext.request.contextPath}/FTZ210103/QryDtl";
		form.submit();
	}
</script>

<div id="id_showMsg" style="display: none">
	<br /> <br />
	<div class="alert alert-error" id="errorMsg" style="display: none"></div>
	<div id="id_result">
		<t:messagePanel />
		<spring:hasBindErrors name="FTZ210103Form">
			<form:form commandName="FTZ210103Form">
				<div class="alert alert-error">
					<form:errors path="*" cssStyle="color:red"></form:errors>
				</div>
			</form:form>
		</spring:hasBindErrors>
	</div>
	<br />
</div>

<div class="page_title">
	<spring:message code="ftzmis.title.210103.qry.dtl" />
</div>

<div class="row">
	<form:form id="form"
		action="${pageContext.request.contextPath}/BMG_TASK_Qry/Qry"
		method="post" modelAttribute="FTZ210103Form" class="form-horizontal">
		<form:hidden path="selected_msgId" id="selected_msgId" />
		<form:hidden path="selected_seqNo" id="selected_seqNo" />
		<table class="tbl_search">
			<tr>
				<td class="label_td"><spring:message code="ftz.label.BRANCH_ID" />：</td>
				<td><form:select path="ftzInMsgCtl.branchId" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${SM_0002}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.MSG_ID" />：</td>
				<td><form:input id="msgId" path="ftzInMsgCtl.msgId"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message
						code="ftz.label.SUBMIT_DATE" />：</td>
				<td><form:input id="submitDate" path="ftzInMsgCtl.submitDate"
						class=".input-large" readonly="true" /></td>
				<td class="label_td"><spring:message
						code="ftz.label.MSG_STATUS" />：</td>
				<td><form:select path="ftzInMsgCtl.msgStatus" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_MSG_STATUS}" />
					</form:select></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message
						code="ftz.label.ACCOUNT_NO" />：</td>
				<td><form:input id="accountNo" path="ftzInMsgCtl.accountNo"
						class=".input-large" readonly="true" /></td>
				<td class="label_td"><spring:message
						code="ftz.label.ACCOUNT_NAME" />：</td>
				<td><form:input id="accountName" path="ftzInMsgCtl.accountName"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td colspan="2" class="label_td"><spring:message
						code="ftz.label.BALANCE_CODE" />：<form:select
						path="ftzInMsgCtl.balanceCode" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${FTZ_BALANCE_INDEX_CODE}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.CURRENCY" />：</td>
				<td><form:select path="ftzInMsgCtl.currency" disabled="true">
						<form:option value=""></form:option>
						<form:options items="${SYS_CURRENCY}" />
					</form:select></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message
						code="ftz.label.DAILY_BALANCE" />：</td>
				<td><t:moneyFormat type="text"
						value="${FTZ210103Form.ftzInMsgCtl.balance}"
						format="###,###,###,###.00" dot="true" readonly="true" />
				<td class="label_td"><spring:message
						code="ftz.label.ACC_ORG_CODE" />：</td>
				<td><form:input id="accOrgCode" path="ftzInMsgCtl.accOrgCode"
						class=".input-large" readonly="true" /></td>
			</tr>
			<tr>
				<td colspan="4"><hr /></td>
			</tr>
			<tr>
				<td class="label_td"><spring:message
						code="ftz.label.PBOC_STATUS" />：</td>
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
				<p class="text-info" align="center">
					<spring:message code="ftz.label.MSG_DTL_List" />
				</p>
				<tr>
					<th style="vertical-align: middle; text-align: center" width="10px"><spring:message
							code="fisp.label.common.no" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message
							code="ftz.label.CD_FLAG" /></th>
					<th style="vertical-align: middle; text-align: center" width="40px"><spring:message
							code="ftz.label.TRAN_DATE" /></th>
					<th style="vertical-align: middle; text-align: center"
						width="100px"><spring:message code="ftz.label.AMOUNT" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message
							code="ftz.label.COUNTRY_CODE" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message
							code="ftz.label.TERM_LENGTH" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message
							code="ftz.label.TERM_UNIT" /></th>
					<th style="vertical-align: middle; text-align: center" width="70px"><spring:message
							code="ftz.label.VALUE_DATE" /></th>
					<th style="vertical-align: middle; text-align: center" width="70px"><spring:message
							code="ftz.label.EXPIRE_DATE" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message
							code="ftz.label.DTL_STATUS" /></th>
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
						<td class="vtip" style="text-align: left; width: 50px;"><t:codeValue
								items="${FTZ_CD_FLAG}" key="${dto1.cdFlag}" type="label" /></td>
						<td class="vtip" style="text-align: left; width: 40px;">${dto1.tranDate}</td>
						<td class="vtip" style="text-align: right; width: 100px;"><t:moneyFormat
								type="label" value="${dto1.amount}" /></td>
						<td class="vtip" style="text-align: left; width: 50px;">${dto1.countryCode}</td>
						<td class="vtip" style="text-align: left; width: 50px;">${dto1.termLength}</td>
						<td class="vtip" style="text-align: left; width: 50px;"><t:codeValue
								items="${FTZ_REBUY_TERM_UNIT}" key="${dto1.termUnit}"
								type="label" /></td>
						<td class="vtip" style="text-align: left; width: 70px;">${dto1.valueDate}</td>
						<td class="vtip" style="text-align: left; width: 70px;">${dto1.expireDate}</td>
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
			query="selected_msgId=${FTZ210103Form.ftzInMsgCtl.msgId}" />
	</div>
</div>
<div class="row" style="margin-bottom: 40px;">
	<div class="navbar navbar-fixed-bottom text-center" id="footer"
		style="margin-bottom: 0px; line-height: 30px; background-color: #eee; opacity: 0.9;">
		<input id="detaildetail" type="button" class="btn btn-primary"
			onclick="showDetaildetail();"
			value="<spring:message code="ftz.label.DTL_DTL"/>"> <input
			type="button" class="btn btn-primary"
			onclick="javascript:window.close();"
			value="<spring:message code="button.lable.close"/>">
	</div>
</div>