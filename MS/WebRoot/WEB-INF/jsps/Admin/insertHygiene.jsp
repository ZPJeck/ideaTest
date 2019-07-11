<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息录入</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
  </head>

  <body bgcolor="cornsilk" text="write" background="img/2.jpg">
  			<h1 class="panel-title" align="center" >
			        <p style="font-size: 60px; color: green;">
			          	卫生检查情况
			        </p>
			</h1>
		
			<center>
				<br /><br /><br />
				
				<table>
				<div style="padding: 100px 600px 10px;">
					<form class="bs-example bs-example-form" action="insertHygiene.do"><!-- http://localhost:8888/Dormitory/ -->
						<div class="input-group">
							<span class="input-group-addon">备注</span>
							<input type="text" class="form-control" placeholder="备注" name="Remarks">
						</div>
						
						<br>
						<!-- 男女选择 -->
						<div class="input-group">
							<span class="input-group-addon">寝室号</span>
							<input type="text" class="form-control" placeholder="寝室号" name="HDnum">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">得分</span>
							<input type="text" class="form-control" placeholder="得分" name="score">
						</div>
						<br>
						
						<br/>
						<button type="submit" class="btn btn-success">注册</button>
						<button type="reset" class="btn btn-info">重置</button>
						
						
					</form>
				</div>
				</table>
			</center>
			</div>
		</div>
		<a href="third.do">返回</a>
	</body>
	
</html>
