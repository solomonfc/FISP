<script type="text/javascript">
	$(function() {
		$("#pageTable").find("tr").bind('click', function() {
			var selected_msgId = $(this).find("td:eq(4)").text();
			var selected_msgNo = $(this).attr("id").substr(2);
			$("#selected_msgId").val(selected_msgId);
			$("#selected_msgNo").val(selected_msgNo);
		});
		$("#pageTable")
		.find("tr")
		.bind(
				'dblclick',
				function() {
					var selected_msgId = $(this).find("td:eq(4)").text();
					var selected_msgNo = $(this).attr("id").substr(2);
					window.showModalDialog(
									'${pageContext.request.contextPath}/FTZOFF/QryRedirect?selected_msgId='+ selected_msgId+'&selected_msgNo='+selected_msgNo,
									window,
									'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');

				});
	});

	function showDetail() {
		var selected_msgId = $("#selected_msgId").val();
		var selected_msgNo = $("#selected_msgNo").val();
		if (null == selected_msgId || "" == selected_msgId) {
			alert('<spring:message code="ftz.validate.choose.data" />');
			return;
		} else {
			window.showModalDialog(
							'${pageContext.request.contextPath}/FTZOFF/QryRedirect?selected_msgId='+ selected_msgId+'&selected_msgNo='+selected_msgNo,
							window,
							'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
		}
	}
	

	function queryFTZOFF() {
		$("#selected_msgId").val("");
		$("#selected_msgNo").val("");
		var form = document.getElementById("form");
		form.action = "${pageContext.request.contextPath}/FTZOFF/Qry";
		form.submit();
	}
</script>




<div id="id_showMsg" style="display: none">
	<br /> <br />
	<div class="alert alert-error" id="errorMsg" style="display: none"></div>
	<div id="id_result">
		<t:messagePanel messagesAttributeName="errmsg" messagesType="error" />
		<t:messagePanel messagesAttributeName="infomsg" messagesType="info" />
		<t:messagePanel messagesAttributeName="successmsg" messagesType="success" />
		<spring:hasBindErrors name="fTZOFFForm">
			<form:form commandName="fTZOFFForm">
				<div class="alert alert-error">
					<form:errors path="*" cssStyle="color:red"></form:errors>
				</div>
			</form:form>
		</spring:hasBindErrors>
	</div>
	<br />
</div>

<div class="page_title"><spring:message code="ftzmis.title.off.query" /><!-- 应付信用证录入/修改 --></div>

<div class="row">
	<form:form id="form"
		action="${pageContext.request.contextPath}/FTZOFF/Qry"
		method="post" modelAttribute="FTZOFFForm" class="form-horizontal">
		<form:hidden path="selected_msgId" id="selected_msgId" />
		<form:hidden path="selected_msgNo" id="selected_msgNo" />
		<table class="tbl_search">
			<tr>
				<td class="label_td"><spring:message code="ftz.label.common.branchId" /><!-- 机构号 -->：</td>
				<td><form:select path="query_branchId">
						<form:option value=""></form:option>
						<form:options items="${SM_0002}" />
					</form:select></td>
				<td class="label_td"><spring:message code="ftz.label.WORK_DATE" /><!-- 工作日期 -->：</td>
				<td><form:input id="query_workDate_start"
						path="query_workDate_start"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" cssClass="span2" />-<form:input
						id="query_workDate_end" path="query_workDate_end"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" cssClass="span2" />
				</td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="ftz.label.MGS_ID" /><!-- 批量号 -->：</td>
				<td><form:input id="query_msgId" path="query_msgId"
						class=".input-large" /></td>
				<td class="label_td"><spring:message code="ftz.label.MSG_STATUS" /><!-- 批量状态 -->：</td>
				<td><form:select path="query_msgStatus">
						<form:option value=""></form:option>
						<form:options items="${FTZ_MSG_STATUS}" />
					</form:select></td>
			</tr>
			<tr>	
				<td class="label_td"><spring:message code="ftzmis.title.off.type" />：</td>
				<td>
					<form:select path="query_msgNo">
						<form:option value=""></form:option>
						<form:options items="${FTZ_OFF_TYPE}" />
					</form:select>
				</td>
				<td class="label_td" colspan="2" style="text-align:right;">
				<button type="button" class="btn btn-primary" id="qry" onclick="queryFTZOFF()">
						<spring:message code="ftz.label.SELECT_MSG" />
				</button>
				</td><!-- i18n -->
			</tr>
		</table>
	</form:form>
</div>

<div class="row">
	<div class="tbl_page_head">
		<table
			class="table table-striped table-bordered table-condensed tbl_page">
			<thead>
				<p class="text-info" align="center"><spring:message code="ftz.label.MSG_List" /><!-- 批量列表 --></p>
				<tr>
					<th style="vertical-align: middle; text-align: center" width="10px">No</th>
					<th style="vertical-align: middle; text-align: center" width="60px"><spring:message code="ftzmis.title.off.type" /></th>
					<th style="vertical-align: middle; text-align: center" width="40px"><spring:message code="ftz.label.WORK_DATE" /><!-- 工作日期 --></th>
					<th style="vertical-align: middle; text-align: center" width="60px"><spring:message code="ftz.label.common.branchId" /></th>
					<th style="vertical-align: middle; text-align: center" width="65px"><spring:message code="ftz.label.MGS_ID" /></th>
					<th style="vertical-align: middle; text-align: center" width="50px"><spring:message code="ftz.label.MSG_STATUS" /></th>
				</tr>
			</thead>
		</table>
	</div>
	<div class="tbl_page_body" style="min-height: 340px; height: 340px;">
		<table id="pageTable"
			class="table table-striped table-bordered table-condensed tbl_page"
			style="border: 0">
			<tbody>
				<c:forEach var="dto" items="${page.content}" varStatus="i">
					<tr id="tr${dto.msgNo}">
						<td style="text-align: center; width: 10px;">${(page.number*page.size)+(i.index+1)}</td>
						<td class="vtip" style="text-align: left; width: 60px;"><t:codeValue items="${FTZ_OFF_TYPE}" key="${dto.msgNo}" type="label" /></td>
						<td class="vtip" style="text-align: center; width: 40px;"><t:dateTimeFormat type="label" value="${dto.workDate}" format="date"/></td>
						<td class="vtip" style="text-align: left; width: 60px;"><t:codeValue items="${SM_0002}" key="${dto.branchId}" type="label" /></td>
						<td class="vtip" style="text-align: left; width: 65px;">${dto.msgId}</td>
						<td class="vtip" style="text-align: left; width: 50px;"><t:codeValue items="${FTZ_MSG_STATUS}" key="${dto.msgStatus}" type="label" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>


<div class="pagination pull-right" style="margin-top: 10px;">
	<table class="text-center">
		<tr>
			<td width="50%" align="center">
			<input id="detail" type="button" class="btn btn-primary" onclick="showDetail();" value="<spring:message code="ftz.label.MSG_Dtl" />">
			</td>
			<td width="50%" align="right">
				<table>
					<tr>
						<td><util:pagination page="${page}"
								query="query_branchId=${FTZOFFForm.query_branchId}&query_workDate_start=${FTZOFFForm.query_workDate_start}&query_workDate_end=${FTZOFFForm.query_workDate_end}&query_msgId=${FTZOFFForm.query_msgId}&query_msgStatus=${FTZOFFForm.query_msgStatus}&query_msgNo=${FTZOFFForm.query_msgNo}" action="/FTZOFF/Qry"/></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>
