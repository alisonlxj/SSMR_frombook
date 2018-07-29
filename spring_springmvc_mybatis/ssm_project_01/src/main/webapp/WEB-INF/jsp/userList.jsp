<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userInfo.jsp' starting page</title>

<meta charset='utf-8'>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<!-- 新 Bootstrap4 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>

<!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>


</head>

<body>
	<div class="container">
	
		<h2>添加人员信息Page</h2>
		<hr>

		<div class="row">
			#{userList}
		</div>

	</div>


</body>

</html>




