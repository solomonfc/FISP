<script type="text/javascript">
//search button
function search() {
	var form = document.getElementById("form");
	form.action = "${pageContext.request.contextPath}/efc01/01/search";
	form.submit();
}

//detail button
function detailSearch(fileId) {
	window.showModalDialog(
					'${pageContext.request.contextPath}/efc01/01/detailSearch?fileId='+ fileId,window,
					'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
}

//add button
function add() {
	window.showModalDialog('${pageContext.request.contextPath}/efc01/03/init', window, 'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');

}

//update button
function update(fileId) {
	window.showModalDialog(
			'${pageContext.request.contextPath}/efc01/04/init?fileId='+ fileId,window,
			'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');

}

//updatefield button
function updateField(fileId) {
	window.showModalDialog(
			'${pageContext.request.contextPath}/efdc01/01/search?fileId='+ fileId,window,
			'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
}

//delete button
function del(fileId)
{
	var form = document.getElementById("form");
	form.action = "${pageContext.request.contextPath}/efc01/05/delete?fileId="+fileId;
	var msg=$("#confirmMsg1").val()+'删除'+$("#confirmMsg2").val();
	if (confirm(msg)){
	form.submit();
	}
}
</script>

<!-- tips information -->
<div id="id_showMsg" style="display: none"><br />
<br />
<div id="id_result"><t:messagePanel messagesAttributeName="errmsg"
	messagesType="error" /> <t:messagePanel
	messagesAttributeName="infomsg" messagesType="info" /> <t:messagePanel
	messagesAttributeName="successmsg" messagesType="success" /> <spring:hasBindErrors
	name="expFileCfgForm">
	<form:form commandName="expFileCfgForm">
		<div class="alert alert-error"><form:errors path="*"
			cssStyle="color:red"></form:errors></div>
	</form:form>
</spring:hasBindErrors></div>
<br />
</div>

<!-- title -->
<div class="page_title">任务管理  / 映射配置  / 报表映射配置</div>

<!-- body -->
<div class="row"><form:form id="form" method="post" action="${pageContext.request.contextPath}/efc01/01/init"
	modelAttribute="expFileCfgForm" class="form-horizontal">
	<table class="tbl_search">
		<tr>
			<td class="label_td"><spring:message code="ef.label.BRANCHID"/></td>
			<td colspan="5"><form:input path="branchId" type="text" class="input-large" maxlength="20" /></td>
		</tr>
		<tr>
			<td class="label_td"><spring:message code="if.label.FILENAME"/></td>
			<td><form:input path="fileName" type="text" class="input-large" maxlength="20" /></td>
			<td class="label_td"><spring:message code="if.label.TABLENAME"/></td>
			<td ><form:input path="tableName" type="text" class="input-large" maxlength="60" /></td>
			<td colspan="2" align="right">
			<button type="button" class="btn btn-primary" onclick="search()"><spring:message code="button.label.Search" /></button>
			<button type="button"  class="btn btn-primary" onclick="add()"><spring:message code="button.label.Add"/></button>
			<button type="button" class="btn btn-primary">导出</button>
			</td>
		</tr>
	</table>
</form:form></div>
<div class="row">
<div class="tbl_page_head">
<table
	class="table table-striped table-bordered table-condensed tbl_page">
	<thead>
		<tr>
			<th class="tbl_page_th" width="20px">No.</th>
			<th class="tbl_page_th" width="100px"><spring:message code="ef.label.BRANCHID"/></th>
			<th class="tbl_page_th" width="120px"><spring:message code="ef.label.FILENAME"/></th>
			<th class="tbl_page_th" width="100px"><spring:message code="ef.label.TABLENAME"/></th>
			<th class="tbl_page_th" width="210px"><spring:message code="index.label.sm.Operation"/></th>
		</tr>
	</thead>
</table>
</div>
<div class="tbl_page_body" style="min-height: 355px; height: 355px;">
<table
	class="table table-striped table-bordered table-condensed tbl_page">
	<tbody>
		<form:form id="expFileCfgForm" action="${pageContext.request.contextPath}"
			modelAttribute="expFileCfgForm">
			<input id="rttpayid" type="hidden" name="rttpay.id" />
			<c:forEach var="dto" items="${page.content}" varStatus="i">
				<tr>
					<td class="tbl_page_td_left" width="20px">${(page.number*page.size)+(i.index+1)}</td>
					<td class="tbl_page_td_left vtip" width="100px">${dto.branchId}</td>
					<td class="tbl_page_td_left vtip" width="120px">${dto.fileName}</td>
					<td class="tbl_page_td_left vtip" width="100px">${dto.tableName}</td>
					<td class="tbl_page_td_left" width="210px">
						<div align="center" style="height: 25px">
							<input type="button" class="btn btn-small" onclick="detailSearch('${f:h(dto.fileId)}')" value="<spring:message code="index.lable.DeatilSearch"/>">
							<input type="button" class="btn btn-small" onclick="update('${f:h(dto.fileId)}')" value="<spring:message code="button.label.Update"/>">
							<input type="button" class="btn btn-small" onclick="del('${f:h(dto.fileId)}')"   value="<spring:message code="button.label.Delete"/>">
							<input type="button" class="btn btn-small" onclick="updateField('${f:h(dto.fileId)}')" value="<spring:message code="button.label.UpdateField"/>">
						</div>
					</td>
				</tr>
			</c:forEach>
		</form:form>
	</tbody>
</table>
</div>
</div>

<!-- page and buttons -->
<div class="pagination pull-right" style="margin-top: 5px; margin-bottom: 0px;">
	<div class="leftPage">
		<util:pagination page="${page}" query="projId=${listForm.projId}&batchNo=${listForm.batchNo}" />
	</div>
</div>
