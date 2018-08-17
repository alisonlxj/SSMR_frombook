<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 新 Bootstrap 核心 CSS  -->
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

<title>Add User Page</title>

</head>

<body>
	<div class="container">
		<div class="row" id="header">
			<div class="col-sm-offset-2 col-sm-6" style="text-align: left">
				<h2>添加User</h2>
			</div>
		</div>

		<hr style=" height:2px;border:none;border-top:2px dotted #185598;" />

		<form class="form-horizontal" role="form" action="/springmvc01/user/addUser" method="post">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">名字</label>
				<div class="col-sm-6">
					<input type="text" name="name" class="form-control" id="name" placeholder="请输入名字">
				</div>
			</div>
			<div class="form-group">
				<label for="age" class="col-sm-2 control-label">年龄</label>
				<div class="col-sm-6">
					<input type="text" name="age" class="form-control" id="age" placeholder="请输入年龄">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">PASSWORD</label>
				<div class="col-sm-6">
					<input type="password" name="password" class="form-control" id="password" placeholder="请输入密码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label> <input type="checkbox" name="isChecked"> CHECKBOX_TAG
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">登录</button>
				</div>
			</div>
		</form>


	</div>

</body>
</html>




