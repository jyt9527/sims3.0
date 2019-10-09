<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sd" uri="/struts-dojo-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>" target="_self">
		<link rel="stylesheet" href="css/comm.css" type="text/css"></link>
		<script type="text/javascript">
function userDetail(file) {
	var o = document.getElementById("detail");
	var tops = file.offsetTop - 80;
	o.offsetTop = tops;
	var str = tops + "px;"
	o.style.visibility = "visible";
}
function closed() {
	var o = document.getElementById("detail");
	o.style.visibility = "hidden";
}

function check() {

	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var upload = document.getElementById("upload").value;
	if (username == null || username == '') {
		alert("用户名不能为空！");
		return false;
	}
	if (password == null || password == '') {
		alert("密码不能为空！");
		return false;
	}
	if (upload == null || upload == "") {
		alert("请上传文件");
		return false;
	}
}

function fun(t) {
	t.style.display = '';
}
function show(t) {
	t.style.display = 'none';
}
</script>
		<sd:head parseContent="true" />
		<s:head theme="xhtml" />
	</head>
	<body>
		<form action="adminManage_adminAdd" method="post" name="adForm"
			enctype="multipart/form-data" onsubmit="return check();">
			<table width="50%" border="0" align="left" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="30">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="15" height="30">
									<img src="images/tab_03.gif" width="15" height="30" />
								</td>
								<td width="1001" background="images/tab_05.gif">
									<img src="images/311.gif" width="16" height="16" />
									<span class="STYLE4">添加管理员信息</span>
								</td>
								<td width="381" background="images/tab_05.gif"></td>
								<td width="14">
									<img src="images/tab_07.gif" width="14" height="30" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						<table width="60%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="9" background="images/tab_12.gif">
									&nbsp;
								</td>
								<td bgcolor="#f3ffe3">

									<table width="100%" border="0" cellpadding="0" cellspacing="1"
										bgcolor="#c0de98">
										<tr>
											<td width="100%" height="26" background="images/tab_14.gif"
												class="STYLE1" colspan="2">
												<div align="center" class="STYLE2 STYLE1">
													添加管理员信息
												</div>
											</td>
										</tr>

										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													id
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													<input type="hidden" name="id" value="">

												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													编号
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input type="text" name="admin.adminId" value="">
												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													用户名
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input id="username" type="text" name="admin.adminName"
														value="" onclick="fun(msg1)" onblur="show(msg1)">
												</div>
												<div id=msg1
													style="color: #ff0000; display: none; text-align: right;">
													请输入您的用户名
												</div>
											</td>

										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													密码
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input id="password" type="password" name="admin.adminPwd"
														value="" onclick="fun(msg2)" onblur="show(msg2)">
												</div>
												<div id=msg2
													style="color: #ff0000; display: none; text-align: right;">
													请输入您的密码
												</div>
											</td>

										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													职位
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input type="text" name="admin.roleId" value="">
												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													电话
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input type="text" name="admin.adminTel" value="">
												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													日期
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<sd:datetimepicker adjustWeeks="true"
														displayFormat="dd/MM/yyyy" toggleType="explode"
														name="admin.adminDate" />

												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													照片
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp; &nbsp;&nbsp;
													<input id="upload" name="fileImage.upload" type="file"
														value="" />
												</div>
											</td>
										</tr>
										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													<input type="reset" name="reset" value="重置" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="left" class="STYLE2 STYLE1">
													&nbsp;&nbsp;
													<input type="submit" name="submit" value="保存" />
													<input type="button" name="back"
														onclick="javascript:history.back(-1);" value="返回" />
												</div>

											</td>
										</tr>
									</table>

								</td>
								<td width="9" background="images/tab_16.gif">
									&nbsp;
								</td>
							</tr>
						</table>
					</td>

				</tr>
				<tr>
					<td height="29">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="15" height="29">
									<img src="images/tab_20.gif" width="15" height="29" />
								</td>
								<td background="images/tab_21.gif">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="25%" height="29" nowrap="nowrap"></td>
											<td width="75%" valign="top" class="STYLE1">
												<div align="right">
													<table width="352" height="20" border="0" cellpadding="0"
														cellspacing="0">
														<tr>
															<td width="62" height="22" valign="middle"></td>
															<td width="50" height="22" valign="middle"></td>
															<td width="54" height="22" valign="middle"></td>
															<td width="49" height="22" valign="middle"></td>

														</tr>
													</table>
												</div>
											</td>
										</tr>
									</table>
								</td>
								<td width="14">
									<img src="images/tab_22.gif" width="14" height="29" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
