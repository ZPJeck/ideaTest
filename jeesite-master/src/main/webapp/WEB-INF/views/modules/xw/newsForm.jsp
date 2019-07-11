<%@ page import="org.springframework.ui.Model" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>新闻审核管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/xw/news/">新闻审核列表</a></li>
		<li class="active"><a href="${ctx}/xw/news/form?id=${news.id}">新闻审核<shiro:hasPermission name="xw:news:edit">${not empty news.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xw:news:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="news" action="${ctx}/xw/news/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">标题：</label>
			<div class="controls">
				<form:input path="title" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<%--<div class="control-group">--%>
			<%--<label class="control-label">内容：</label>--%>
			<%--<div class="controls">--%>
				<%--<form:textarea path="content" htmlEscape="false" rows="4" maxlength="10000" class="input-xxlarge required"/>--%>
				<%--<span class="help-inline"><font color="red">*</font> </span>--%>
			<%--</div>--%>
		<%--</div>--%>

		<div class="control-group">
			<label class="control-label">正文内容:</label>
			<div class="controls">
				<form:textarea id="content" htmlEscape="true" path="content" rows="4" maxlength="200" class="input-xxlarge"/>
				<sys:ckeditor replace="content" uploadPath="/cms/article" />
			</div>
		</div>
		<%--<div class="control-group">--%>
			<%--<label class="control-label">发布人id：</label>--%>
			<%--<div class="controls">--%>
				<%--<form:input path="userId" htmlEscape="false" maxlength="255" class="input-xlarge required"/>--%>
				<%--<span class="help-inline"><font color="red">*</font> </span>--%>
			<%--</div>--%>
		<%--</div>--%>
		<%--<div class="control-group">--%>
			<%--<label class="control-label">审核人id：</label>--%>
			<%--<div class="controls">--%>
				<%--<form:input path="eamId" htmlEscape="false" maxlength="255" class="input-xlarge required"/>--%>
				<%--<span class="help-inline"><font color="red">*</font> </span>--%>
			<%--</div>--%>
		<%--</div>--%>
		<div class="control-group">
			<label class="control-label">备注信息：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
			</div>
		</div>

		<%
			if(request.getAttribute("role") == "1"){
		%>

		<div class="control-group">
			<label class="control-label">审核状态：</label>
			<div class="controls">
					<%--<form:input path="status" htmlEscape="false" maxlength="255" class="input-xlarge required"/>--%>
					<%--<span class="help-inline"><font color="red">*</font> </span>--%>
				<form:radiobuttons path="status" items="${fns:getDictList('shenhe_status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
			</div>
		</div>

		<%}%>

		<div class="form-actions">
			<shiro:hasPermission name="xw:news:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>