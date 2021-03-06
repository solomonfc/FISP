<%@page import="com.synesoft.fisp.app.common.constants.CommonConst"%>
<script type="text/javascript">
	//init page
	$(function() {
		var msg = "${successmsg}";
		if(msg && msg!=""){
			$("input:not(:button,:hidden)").prop("readonly", true);
			$("#confirmBtn").attr("disabled", "disabled");
		}
	});
	//modify button
	function modify() {
		getMenuList();
		var form = document.getElementById("form");
		form.action = "${pageContext.request.contextPath}/sm02/03/modify";
		var msg=$("#confirmMsg1").val()+$("#confirmBtn").val()+$("#confirmMsg2").val();
		if (confirm(msg)){
			form.submit();
		}else{
			return false;
		}
	}
	function getMenuList(){
		var funcTree = Ext.getCmp('funcTree');
		var chkids = '';
		var chkFuncs = funcTree.getChecked();
		Ext.each(chkFuncs,function(item){
			if(item.attributes.value){
				chkids += item.attributes.value + '<%=CommonConst.SEPERATOR%>' ;
			}
		});
		
		if(chkids.length > 0){
			chkids = chkids.substring(0,chkids.length-1);
		}
		$("#menulist").val(chkids);
	};
</script>
<!-- tips information -->
<div id="id_showMsg" style="display: none"> 
	<br /><br />
	<div id="id_result">
		<t:messagePanel messagesAttributeName="errmsg" messagesType="error" />
		<t:messagePanel messagesAttributeName="infomsg" messagesType="info" />
		<t:messagePanel messagesAttributeName="successmsg" messagesType="success" />
		<spring:hasBindErrors name="roleInfForm">
			<form:form commandName="roleInfForm">
				<div class="alert alert-error">
					<form:errors path="*" cssStyle="color:red"></form:errors>
				</div>
			</form:form>
		</spring:hasBindErrors>
	</div>
	<br />
</div>
<!-- title -->
<div class="page_title"><spring:message code="index.label.sm.RoleInfoMaintenanceModify"/></div>

<!-- body -->
<div class="row" style="margin-bottom: 40px;">
	<form:form id="form" action="${pageContext.request.contextPath}/sm02/03/init" method="post" modelAttribute="roleInfForm" class="form-horizontal">
		<table class="tbl_search">
	    	<tr>
				<td width="40%" class="label_td"><spring:message code="index.label.sm.RoleId"/>
				</td>
				<td width="60%">
					<form:input id="roleid" path="roleInf.roleid" type="text" class=".input-small" maxlength="20" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td class="label_td"><font color="red">*</font><spring:message code="index.label.sm.RoleName"/>
				</td>
				<td>
					<form:input id="rolename" path="rolename" type="text" class="span8" maxlength="60"/>
				</td>
			<tr>
			<tr>
				<td class="label_td"><spring:message code="index.label.sm.RoleDesc"/>
				</td>
				<td>
					<form:input id="roledesc" path="roleInf.roledesc" type="text" class="span8" maxlength="256"/>
				</td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="index.label.sm.CreateOrgName"/>
				</td>
				<td>
					<t:codeValue items="${SM_0002 }" key="${roleInfForm.roleInf.createorg}" type="text" cssClass=".input-small" readonly="true"/>
					<form:input type="hidden" id="createorg" path="roleInf.createorg"/>
				</td>
			<tr>
			<tr>
				<td class="label_td">
					<spring:message code="index.label.sm.InfrUseFlag"/>
				</td>
				<td>
					<form:checkbox path="roleInf.infruseflag" value="01" cssStyle="margin-right:10px;"/><spring:message code="index.lable.CanUse"/>
				</td>
			</tr>
			<tr>
				<td class="label_td">
					<font color="red">*</font>
					<spring:message code="index.label.sm.MenuList"/>
				</td>
				<td id="menuTd">
					<jsp:include page="SM_00_01.jsp?menuId=${form.meunlist }&editable=${form.editable }"></jsp:include>
					<form:input type="hidden" id="menulist" path="meunlist"/>
				</td>
	    	</tr>
	    </table>											
	</form:form>
</div>
<div class="row">
	<div class="navbar navbar-fixed-bottom text-right" id="footer" style="margin-bottom:0px; line-height:30px; background-color: #eee; opacity:0.9;">
 		<input id="confirmBtn" type="button" class="btn btn-primary" onclick="modify()" value="<spring:message code="button.lable.Submit"/>">
 		<input type="button" class="btn btn-primary" onclick="javascript:window.close();" value="<spring:message code="button.lable.close"/>">
	</div>
</div>