<%@page import="nyist.net.po.User"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UserLoginOK.jsp' starting page</title>
    
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
		<%
			User user=new User();
			user=(User)session.getAttribute("user2");
			/* request.setAttribute("user", user); */
			session.setAttribute("user", user);
		 %>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>报&nbsp;修&nbsp;信&nbsp;息--管理</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="UqueryBaoXiu.do" style="color: fuchsia;">我的报修信息</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="#"  style="color: fuchsia;">我要在线报修</a></font></td>
				</tr>
				
			</tbody>
		</table>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>信&nbsp;息--查询</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="#" style="color: fuchsia;">水电信息</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="#"  style="color: fuchsia;">卫生信息</a></font></td>
				</tr>
				
			</tbody>
		</table>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>遗&nbsp;失&nbsp;信&nbsp;息</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="#" style="color: fuchsia;">浏览遗失信息</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="#"  style="color: fuchsia;">发布遗失信息</a></font></td>
				</tr>
				
			</tbody>
		</table>
		
		
   		
  </body>
</html>
