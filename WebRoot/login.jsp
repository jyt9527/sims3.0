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

		<title>用户登录</title>

		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	overflow: hidden;
}

.STYLE3 {
	color: #528311;
	font-size: 12px;
}

.STYLE4 {
	color: #42870a;
	font-size: 12px;
}

.STYLE5 {
	color: red;
	font-size: 12px;
}
-->
</style>
		<script type="text/javascript">
</script>
	</head>

	<body>
		<form action="loginAction.action" method="post" name="LoginForm">
			<table width="100%" height="100%" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td bgcolor="#e5f6cf">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td height="608" background="images/login_03.gif">
						<table width="862" border="0" align="center" cellpadding="0"
							cellspacing="0">
							<tr>
								<td height="266" background="images/login_04.gif">
									&nbsp;
								</td>
							</tr>
							<tr>
								<td height="95">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="424" height="95" background="images/login_06.gif"></td>
											<td width="183" background="images/login_07.gif">
												<table width="100%" border="0" cellspacing="0"
													cellpadding="0">
													<tr>
														<td width="40%" height="30">
															<div align="center">
																<span class="STYLE3">用户</span>
															</div>
														</td>
														<td width="40%" height="30">
															<input type="text" name="username"
																style="height: 18px; width: 70px; border: solid 1px #cadcb2; font-size: 12px; color: #81b432;"
																value="admin">
														</td>
														<td width="20%">
															<span class="STYLE3">选择身份</span>
														</td>
													</tr>
													<tr>
														<td height="30">
															<div align="center">
																<span class="STYLE3">密码</span>
															</div>
														</td>
														<td height="30">
															<input type="password" name="password"
																style="height: 18px; width: 70px; border: solid 1px #cadcb2; font-size: 12px; color: #81b432;"
																value="admin">
														</td>
														<td>
															<select name="role"
																style="font-size: 12px; color: #81b432;">
																<option value="admin">
																	管理员
																</option>
																<option value="teacher">
																	教师
																</option>
																<option value="student">
																	学生
																</option>
															</select>
														</td>
													</tr>
													<tr>
														<td height="30">
															&nbsp;
														</td>
														<td height="30">
															<img src="images/dl.gif" width="81" height="22"
																border="0" usemap="#Map">
															<span class="STYLE5"></span>
														</td>
													</tr>
												</table>
											</td>
											<td width="255" background="images/login_08.gif">
												&nbsp;
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td height="247" valign="top" background="images/login_09.gif">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="22%" height="30">
												&nbsp;
											</td>
											<td width="56%">
												&nbsp;
											</td>
											<td width="22%">
												&nbsp;
											</td>
										</tr>
										<tr>
											<td>
												&nbsp;
											</td>
											<td height="30">
												<table width="100%" border="0" cellspacing="0"
													cellpadding="0">
													<tr>
														<td width="44%" height="20">
															&nbsp;
														</td>
														<td width="56%" class="STYLE4"></td>
													</tr>
												</table>
											</td>
											<td>
												&nbsp;
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>

				</tr>
			</table>
		</form>
		<map name="Map">
			<area shape="rect" coords="3,3,36,19"
				href="javascript:document.LoginForm.submit()">
			<area shape="rect" coords="40,3,78,18"
				href="javascript:document.LoginForm.reset()">
		</map>
	</body>
</html>

