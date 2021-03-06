<script type="text/javascript">
	//search button
	function search() {
		var form = document.getElementById("form");
		form.action = "${pageContext.request.contextPath}/dp01/01/search";
		form.submit();
	}
	//modify button
	function modify(id) {
		var old_url = window.location.href;
		document.getElementById("loanAmountId").value = id;
		window.showModalDialog('${pageContext.request.contextPath}/dp01/02/search?loanAmount.id='+id, window, 'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
		window.location.href = old_url;
	}
	//del button
	function del(id) {
		document.getElementById("loanAmountId").value = id;
		var form = document.getElementById("loanAmountListForm");
		form.action = "${pageContext.request.contextPath}/dp01/01/del";
		var msg=$("#confirmMsg1").val()+$("#deleteBtn").val()+$("#confirmMsg2").val();
		if (confirm(msg)){
			form.submit();
		}else{
			return false;
		}
		
	}
	//detail button
	function detailSearch(id) {
		document.getElementById("loanAmountId").value = id;
		window.showModalDialog('${pageContext.request.contextPath}/dp01/03/detailSearch?loanAmount.id='+id, window, 'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
	}
	
	//add button
	function add() {
		window.showModalDialog('${pageContext.request.contextPath}/dp01/06/init', window, 'dialogHeight:500px; dialogWidth: 1024px;edge: Raised; center: Yes; help: no; resizable: Yes; status: no;');
	
	}
	
	
</script>
<!-- tips information -->
<div id="id_showMsg" style="display: none"> 
	<br /><br />
	<div id="id_result">
		<t:messagePanel messagesAttributeName="errmsg" messagesType="error" />
		<t:messagePanel messagesAttributeName="infomsg" messagesType="info" />
		<t:messagePanel messagesAttributeName="successmsg" messagesType="success" />
		<spring:hasBindErrors name="loanAmountForm">
			<form:form commandName="loanAmountForm">
				<div class="alert alert-error">
					<form:errors path="*" cssStyle="color:red"></form:errors>
				</div>
			</form:form>
		</spring:hasBindErrors>
	</div>
	<br />
</div>
<!-- title -->
<div class="page_title"><spring:message code="fisp.title.DataManageLoanAmountInputQuery"/></div>

<!-- body -->
<div class="row">
	<form:form id="form" action="${pageContext.request.contextPath}/dp01/01/init" method="post" modelAttribute="loanAmountForm" class="form-horizontal">
		<table class="tbl_search">
	    	<tr>
	    		<td class="label_td"><spring:message code="fisp.la.workdate"/></td>
				<td>
					 <form:input path="loanAmount.workDate" id="strDate" type="text" maxlength="8" class="WdateInput"
					 onclick="WdatePicker({maxDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd'});" />&nbsp;~&nbsp;  
				 	<form:input path="workdate" id="endDate" type="text" maxlength="8" class="WdateInput"
					 onclick="WdatePicker({maxDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd'});" />
				</td>
				<td class="label_td"><spring:message code="fisp.la.customerNo"/></td>
				<td>
					<form:input path="loanAmount.customerNo" type="text" class=".input-small"/>
				</td>
			</tr>
			<tr>
	    		<td class="label_td"><spring:message code="fisp.la.loanIouAmount"/></td>
				<td>
					<form:input path="loanAmount.loanIouAmount" type="text" class="input-small"/>&nbsp;~&nbsp;  
					<form:input path="loanIouAmount" type="text" class="input-small"/>
				</td>
				<td class="label_td"><spring:message code="fisp.la.productType"/></td>
				<td>
					<form:select path="loanAmount.productType" class=".input-small">
						<form:option value=""/>
						<form:options items="${DP_0005}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td class="label_td"><spring:message code="fisp.la.customerName"/></td>
				<td colspan="2">
					<form:input path="loanAmount.customerName" type="text" class="input-xxlarge"/>
				</td>
				<td>
	    			<div align="right">
	    				<button type="button" class="btn btn-primary" onclick="search()"><spring:message code="button.label.Search"/></button>
	    				<button type="button" class="btn btn-primary" onclick="add()"><spring:message code="button.lable.Add"/></button>
	    				
	    			</div>
	    		</td>
			</tr>
	    </table>											
	</form:form>
</div>
<div class="row">
	<div class="tbl_page_head">
	<table class="table table-striped table-bordered table-condensed tbl_page">
      <thead>
        <tr>
        	<th class="tbl_page_th" width="20px">No.</th>
          	<th class="tbl_page_th" width="70px"><spring:message code="fisp.la.workdate"/></th>
          	<th class="tbl_page_th" width="65px"><spring:message code="fisp.la.rsv1"/></th>
          	<th class="tbl_page_th" width="65px"><spring:message code="fisp.la.customerNo"/></th>
          	<th class="tbl_page_th" width="65px"><spring:message code="fisp.la.customerType"/></th>
          	<th class="tbl_page_th" width="90px"><spring:message code="fisp.la.customerName"/></th>
          	<th class="tbl_page_th" width="50px"><spring:message code="fisp.la.productType"/></th>
          	<th class="tbl_page_th" width="72px"><spring:message code="fisp.la.currency"/></th>
            <th class="tbl_page_th" width="80px"><spring:message code="fisp.la.loanIouAmount"/></th>
          	<th class="tbl_page_th" width="65px"><spring:message code="fisp.la.status"/></th>
          	<th class="tbl_page_th" width="140px"><spring:message code="index.label.sm.Operation"/></th>
        </tr>
      </thead>
     </table>
    </div>
    <div class="tbl_page_body"    >
	  <table class="table table-striped table-bordered table-condensed tbl_page">
      <tbody>
      <form:form id="loanAmountListForm" action="${pageContext.request.contextPath}" modelAttribute="loanAmountForm">
      	<input id="loanAmountId" type="hidden" name="loanAmount.id"/>
        <c:forEach var="dto" items="${page.content}" varStatus="i">
          <tr>
          	<td class="tbl_page_td_left vtip" width="20px">${(page.number*page.size)+(i.index+1)}</td>
            <td class="tbl_page_td_left vtip" width="70px">
            	<t:dateTimeFormat type="label" value="${dto.workDate}" format="date" />
			</td>
		  	<td class="tbl_page_td_left vtip" width="65px">
           		<font size="2px" class="vtip">
           			<t:codeValue items="${DP_0019 }" key="${dto.rsv1}" type="label" />
           		</font></td>
             <td class="tbl_page_td_left vtip" width="65px">${dto.customerNo}</td>
             <td class="tbl_page_td_left vtip" width="65px">
           		<font size="2px" class="vtip">
           			<t:codeValue items="${DP_0016 }" key="${dto.customerType}" type="label" />
           		</font></td>
            <td class="tbl_page_td_left" width="90px">${dto.customerName}</td>
            <td class="tbl_page_td_left vtip" width="50px">
            	<font size="2px" class="vtip">
            		<t:codeValue items="${DP_0005 }" key="${dto.productType}" type="label" />
            	</font></td>
             <td class="tbl_page_td_left vtip" width="72px">
            	<font size="2px" class="vtip">
            		<t:codeValue items="${DP_0014 }" key="${dto.currency}" type="label" />
            	</font>
           	</td>
            <td class="tbl_page_td_right vtip" width="80px">
               <t:moneyFormat type="label" value="${dto.loanIouAmount}" />
            </td>
            
            <td class="tbl_page_td_left vtip" width="65px">
            	<font size="2px" class="vtip">
            		<t:codeValue items="${DP_0001 }" key="${dto.sinputStatus}" type="label" />
            	</font>
           	</td>
            <td class="tbl_page_td_left" width="140px">
	           	<div align="center" style="height: 25px">
					<input type="button" id="detailBtn" class="btn btn-small" onclick="detailSearch('${f:h(dto.id)}')"value="<spring:message code="button.lable.DeatilSearch"/>">
					<input type="button" id="addBtn" class="btn btn-small" onclick="modify('${f:h(dto.id)}')"value="<spring:message code="button.fisp.input"/>">
					<input type="button" id="deleteBtn" class="btn btn-small" onclick="del('${f:h(dto.id)}')" value="<spring:message code="button.lable.Del"/>">
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
		<util:pagination page="${page}" query="branch=${loanAmountForm.loanAmount.branch}&workDate=${loanAmountForm.loanAmount.workDate}
		&referenceNo=${loanAmountForm.loanAmount.referenceNo}&customerNo=${loanAmountForm.loanAmount.customerNo}&customerName=${loanAmountForm.loanAmount.customerName}" />
	</div>
</div>
