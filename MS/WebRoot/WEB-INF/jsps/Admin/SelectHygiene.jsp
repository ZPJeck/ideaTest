<%@page import="nyist.net.po.Hygiene"%>
<%@page import="nyist.net.po.BaoXiu"%>
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
    
    <title>查找报修情况</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	<style type="text/css">
  		#button{
				with:60px;
				height: 40px;
				color: #698B22;
				background-color: #9ACD32;
			}
  	</style>
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
				<th width="80">时间</th>
				<th width="80">卫生情况</th>
				<th width="80">得分</th>
				<th width="80">寝室号</th>
				<th width="80">操作</th>
			</tbody>         <!--- 属性  用thead  加重字体颜色     <th> </th> --->
			<%
				List<Hygiene> hygiene=(List<Hygiene>)session.getAttribute("hygiene");
				int i=1;
			 %>
			<%for(Hygiene hygienes: hygiene){  %>
				<tr align="center">
					<td><%=i++ %></td>
					<td><%=hygienes.getHTime() %></td>
					<td><%=hygienes.getRemarks()%></td>
					<td><%=hygienes.getScore() %></td>
					<td><%=hygienes.getHDnum() %></td>
					<td><a href="DeleteHygiene.do" class="btn btn-info" >删除</a></td>
					<%
						Integer HDnum=hygienes.getHDnum();
						session.setAttribute("HDnum", HDnum);
					 %>
				</tr>
			<%}%> 
		</table>           
		<a href="third.do">返回</a>
  </body>
</html>
