<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>文件上传</title>
	</head>

	<body>
		<!-- ${pageContext.request.contextPath}用于解决使用相对路径时出现的问题，它的作用是取出所部署项目的名字。 -->
		<form action="${pageContext.request.contextPath}/UploadServlet"
			enctype="multipart/form-data" method="post">
			上传文件1：
			<input type="file" name="file1">
			<br />
			上传文件2：
			<input type="file" name="file2">
			<br />
			<input type="submit" value="提交">
		</form>
	</body>
</html>