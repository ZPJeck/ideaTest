<%@page import="nyist.net.po.User"%>
<%@page import="org.springframework.ui.Model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查找所有用户消息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   		<h1 class="panel-title" align="center" >
			        <p style="font-size: 60px; color: green;">
			          	欢迎使用宿舍管理系统
			        </p>
		</h1>
		<hr><br><br/><br/>
		<table align="center" border="1" width="600" >
			<tbody align="center">
				<th width="80">序号</th>
				<th width="80">姓名</th>
				<th width="80">性别</th>
				<th width="80">学号</th>
				<th width="80">寝室号</th>
				<th width="80">床位号</th>

			</tbody>         <!--- 属性  用thead  加重字体颜色     <th> </th> --->
			<c:forEach items="${userList}" var="user" varStatus="s">
				<tr align="center">
					<td>${s.index+1}</td>
					<td>${user.username }</td>
					<td>${user.sex }</td>
					<td>${user.stu }</td>
					<td>${user.dnum }</td>
					<td>${user.bedNum }</td>
				</tr>
			</c:forEach>
		</table>           
		<a href="third.do">返回</a>
  </body>
</html>
