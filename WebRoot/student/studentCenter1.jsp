<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>用户中心</title>
	</head>

	<frameset rows="61,*,24" cols="*" framespacing="0" frameborder="no"
		border="0">
		<frame src="student/studentTop.jsp" name="topFrame" scrolling="No"
			noresize="noresize" id="topFrame" />
		<frame src="student/studentCenter.jsp" name="mainFrame" id="mainFrame" />
		<frame src="student/studentDown.jsp" name="bottomFrame" scrolling="No"
			noresize="noresize" id="bottomFrame" />
	</frameset>
	<noframes>
		<body>
		</body>
	</noframes>