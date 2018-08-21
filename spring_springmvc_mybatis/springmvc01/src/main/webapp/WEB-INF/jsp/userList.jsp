<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 新 Bootstrap 核心 CSS -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">

<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Show Some User</title>


</head>

<body>

	<div class="container">
		<div class="row" id="header">
			<div class="col-sm-6" style="text-align: left">
				<h2>显示所有User</h2>
			</div>
		</div>

		<hr style=" height:2px;border:none;border-top:2px dotted #185598;" />

		<!-- 输出标签 
		<c:out value="${userList}"></c:out>			-->

		<!-- if标签,test属性用于存放判断的条件，一般使用EL表达式来编写。var指定名称用来存放判断的结果类型为true或false,scope用来存放var属性存放的范围 
		<c:if test="" var="aa" ></c:if>				-->


		<!-- forTokens	类似于字符串splite分割
			items:	被迭代的字符串
			delims:	指定的分割符
			var:	遍历的元素项
		 -->

		<!-- forEach
			var		设定变量名，用于存储从集合中取出的每项元素
			items	要遍历的集合
			begin|end	起始位置，终止位置。有默认
			step	指定循环的步长
			varStatus	通过index,count,first,last几个状态值，描述begin 和 end 子集中元素的状态
		 -->
		<c:forEach items="${userList}" var="user">
			<div class="panel panel-primary" style="width: 60%">
				<div class="panel-heading">
					<h3 class="panel-title">
						user_id:
						<c:out value="${user.id}" />
					</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2" style="text-align: right">姓名</div>
						<div class="col-md-10" style="text-align: left">${user.name}</div>
					</div>
					<div class="row">
						<div class="col-md-2" style="text-align: right">年龄</div>
						<div class="col-md-10" style="text-align: left">${user.age}</div>
					</div>
					<div class="row">
						<div class="col-md-2" style="text-align: right">密码</div>
						<div class="col-md-10" style="text-align: left">${user.password}</div>
					</div>

				</div>
			</div>
		</c:forEach>








	</div>

</body>
</html>



