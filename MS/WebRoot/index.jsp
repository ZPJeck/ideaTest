<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
			a{
				text-decoration: none;
			}
			a:link{color: darkviolet}/*未访问链接*/
			a:hover{color: hotpink;}/* 鼠标移动到链接上*/
			a:visited{color: lightgreen;}/*访问的链接*/
			a:active{color: palevioletred;}/*选定的链接*/
			
	</style><meta http-equiv="description" content="This is my page">
  </head>

  <body bgcolor="cornsilk" text="write" background="img/2.jpg">
  			<h1 class="panel-title" align="center" >
			        <p style="font-size: 60px; color: green;">
			          	欢迎使用宿舍管理系统
			        </p>
			</h1>
		
			<center>
				<br /><br /><br /><br /><br />
				
				<table>
				<div style="padding: 100px 600px 10px;">
					<form class="bs-example bs-example-form" action="Login.do"><!-- http://localhost:8888/Dormitory/ -->
						<div class="input-group">
							<span class="input-group-addon">用户名</span>
							<input type="text" class="form-control" placeholder="用户名" name="username">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">密&nbsp;&nbsp;&nbsp;码</span>
							<input type="password" class="form-control" placeholder="密码" name="password">
						</div>
						<br>
						类型        <select name="position">
						<option value="学生">学生</option>
						<option value="管理员">管理员</option>
						</select>
						<br/>
						<button type="submit" class="btn btn-success">登录</button>
						<button type="reset" class="btn btn-info">重置</button>
						<!-- <a href="11.jsp">
						<input type="button" class="" value="注册" ></a> -->
						
					</form>
				</div>
				</table>
			</center>
			</div>
		</div>
	</body>
	
</html>
