<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>新闻审核管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="#">新闻列表</a></li>
		<%--<shiro:hasPermission name="xw:news:edit"><li><a href="${ctx}/xw/news/form">新闻审核添加</a></li></shiro:hasPermission>--%>
	</ul>
	<form:form id="searchForm" modelAttribute="news" action="${ctx}/xw/news/findByStatus?status=${news.status}"
			   method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>标题：</label>
				<form:input path="title" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>标题</th>
				<th>发布人</th>
				<th>审核人</th>
				<th>修改时间</th>
				<shiro:hasPermission name="xw:news:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="news">
			<tr>
				<td><a href="${ctx}/xw/news/form?id=${news.id}">
					${news.title}
				</a></td>
				<td>${news.publisher}</td>
				<td>${news.reviewer}</td>
				<td>
					<fmt:formatDate value="${news.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="xw:news:edit"><td>
    				<a href="${ctx}/xw/news/form?id=${news.id}">查看</a>
					<a href="${ctx}/xw/news/delete?id=${news.id}" onclick="return confirmx('确认要删除该新闻审核吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>