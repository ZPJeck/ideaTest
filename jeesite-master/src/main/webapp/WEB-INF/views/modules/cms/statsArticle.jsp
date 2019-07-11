<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>会员——草稿</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		function autoRowSpan(tb,row,col){
	        var lastValue="",value="",pos=1;
	        for(var i=row;i<tb.rows.length;i++){
	            value = tb.rows[i].cells[col].innerText;
	            if(lastValue == value){
	                tb.rows[i].deleteCell(col);
	                tb.rows[i-pos].cells[col].rowSpan = tb.rows[i-pos].cells[col].rowSpan+1;
	                pos++;
	            }else{
	                lastValue = value;
	                pos=1;
	            }
	        }
	    }
		$(document).ready(function(){
			autoRowSpan(contentTable,0,0);
	        $("td,th").css({"text-align":"center","vertical-align":"middle"});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/cms/stats/article">审核未通过</a></li>
	</ul>
	<%--<form:form id="searchForm" modelAttribute="article" action="${ctx}/cms/stats/article" method="post" class="breadcrumb form-search">--%>
		<%--<div>--%>
			<%--<label>归属栏目：</label><sys:treeselect id="category" name="categoryId" value="${paramMap.id}" labelName="categoryName" labelValue="${paramMap.name}"--%>
				<%--title="栏目" url="/cms/category/treeData" module="article" cssClass="input-small" allowClear="true"/>--%>
			<%--<label>归属机构：</label><sys:treeselect id="office" name="officeId" value="${paramMap.office.id}" labelName="officeName" labelValue="${paramMap.office.name}"--%>
				<%--title="机构" url="/sys/office/treeData" cssClass="input-small" allowClear="true"/>--%>
			<%--<label>开始日期：</label><input id="beginDate" name="beginDate" type="text" readonly="readonly" maxlength="20" class="input-small Wdate"--%>
				<%--value="${paramMap.beginDate}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>--%>
			<%--<label>结束日期：</label><input id="endDate" name="endDate" type="text" readonly="readonly" maxlength="20" class="input-small Wdate"--%>
				<%--value="${paramMap.endDate}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>&nbsp;&nbsp;--%>
			<%--<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>--%>
		<%--</div>--%>
	<%--</form:form>--%>
	<%--<form:form id="searchForm" modelAttribute="article" action="${ctx}/cms/stats/article" method="post" class="breadcrumb form-search">--%>
		<%--<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>--%>
		<%--<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>--%>
		<%--<label>标题：</label><form:input path="title" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;--%>
		<%--<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;--%>
		<%--<label>状态：</label><form:radiobuttons onclick="$('#searchForm').submit();" path="delFlag" items="${fns:getDictList('cms_del_flag')}" itemLabel="label" itemValue="value" htmlEscape="false" />--%>
	<%--</form:form>--%>
	<form:form id="" >
		<input type="text">
	</form:form>
	<%--<sys:message content="${message}"/>--%>
	<%--<table id="contentTable" class="table table-striped table-bordered table-condensed">--%>
		<%--<thead><tr><th>父级栏目</th><th>栏目名称</th><th>信息量</th><th>点击量</th><th>最后更新时间</th><th>归属机构</th>--%>
		<%--<tbody>--%>
		<%--<c:forEach items="${list}" var="stats">--%>
			<%--<tr>--%>
				<%--<td><a href="javascript:" onclick="$('#categoryId').val('${stats.parent.id}');$('#categoryName').val('${stats.parent.name}');$('#searchForm').submit();return false;">${stats.parent.name}</a></td>--%>
				<%--<td><a href="javascript:" onclick="$('#categoryId').val('${stats.id}');$('#categoryName').val('${stats.name}');$('#searchForm').submit();return false;">${stats.name}</a></td>--%>
				<%--<td>${stats.cnt}</td>--%>
				<%--<td>${stats.hits}</td>--%>
				<%--<td><fmt:formatDate value="${stats.updateDate}" type="both"/></td>--%>
				<%--<td><a href="javascript:" onclick="$('#officeId').val('${stats.office.id}');$('#officeName').val('${stats.office.name}');$('#searchForm').submit();return false;">${stats.office.name}</a></td>--%>
			<%--</tr>--%>
		<%--</c:forEach>--%>
		<%--</tbody>--%>
	<%--</table>--%>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-bordered table-condensed">
		<thead><tr><th>标题</th><th>发布人</th><th>发布时间</th><th nowrap="nowrap">操作</th></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="comment">
			<tr>
					<%--<td><a href="javascript:" onclick="$('#c_${comment.id}').toggle()">${fns:abbr(fns:replaceHtml(comment.content),40)}</a></td>--%>
				<td><a href="${pageContext.request.contextPath}${fns:getFrontPath()}/view-${comment.category.id}-${comment.contentId}${fns:getUrlSuffix()}" title="${comment.title}" onclick="return view(this.href);">${fns:abbr(comment.title,40)}</a></td>
				<td>${comment.name}</td>
				<%--<td>${comment.ip}</td>--%>
				<td><fmt:formatDate value="${comment.createDate}" type="both"/></td>
				<td><shiro:hasPermission name="cms:comment:edit">
					<c:if test="${comment.delFlag ne '2'}"><a href="${ctx}/cms/comment/delete?id=${comment.id}${comment.delFlag ne 0?'&isRe=true':''}"
															  onclick="return confirmx('确认要${comment.delFlag ne 0?'恢复审核':'删除'}该审核吗？', this.href)">${comment.delFlag ne 0?'恢复审核':'删除'}</a></c:if>
					<c:if test="${comment.delFlag eq '2'}"><a href="${ctx}/cms/comment/save?id=${comment.id}">审核通过</a></c:if></shiro:hasPermission>
				</td>
				<%--此处操作应该是查看--%>
			</tr>
			<tr id="c_${comment.id}" style="background:#fdfdfd;display:none;"><td colspan="6">${fns:replaceHtml(comment.content)}</td></tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>