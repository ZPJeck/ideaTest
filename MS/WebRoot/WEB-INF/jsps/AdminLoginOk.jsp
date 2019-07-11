<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登录成功</title>
    
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
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>学&nbsp;生&nbsp;信&nbsp;息--管理</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="queryUser.do" style="color: fuchsia;">查看信息</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="jumpInsertUser.do"  style="color: fuchsia;">录入信息</a></font></td>
				</tr>
				
			</tbody>
		</table>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>审&nbsp;核&nbsp;信&nbsp;息--管理</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="queryBaoXiu.do" style="color: fuchsia;">报修审核</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="queryLossByAdmin.do"  style="color: fuchsia;">遗失审核</a></font></td>
				</tr>
				
			</tbody>
		</table>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>卫&nbsp;生&nbsp;管&nbsp;理--信息</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="queryHygiene.do" style="color: fuchsia;">检查信息管理</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="two.do"  style="color: fuchsia;">检查信息添加</a></font></td>
				</tr>
				
			</tbody>
		</table>
		<table  border="1" width="200">
			<tbody >  
				<tr align="center" bgcolor="#90EE90">
					<td>水&nbsp;电&nbsp;费&nbsp;--管理</td>
				</tr>
				<tr align="center" bgcolor="aliceblue" >
					<td><font color="red"><a href="queryWater.do" style="color: fuchsia;">水电费--管理</a></font></td>
				</tr>
				<tr align="center" bgcolor="aliceblue">
					<td><font color="red"><a href="one.do"  style="color: fuchsia;">水电费--添加</a></font></td>
				</tr>
				
			</tbody>
		</table>
		
   		
   	
   		
   
   
  </body>
</html>
