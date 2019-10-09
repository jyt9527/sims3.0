<%@ page language="java" import="java.util.*,cn.jyt.sims.pojo.Admin"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sd" uri="/struts-dojo-tags"%>

<html>
	<head>
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
function submitUpload() {
	if (document.getElementById("upload").value == null
			|| document.getElementById("upload").value == "") {
		alert("请上传文件");
		return false;
	} else {
		return true;
	}
}
</script>
		<sd:head parseContent="true" />
		<s:head theme="xhtml" />
	</head>
	<body>
		<form action="adminManage_adminSave" method="post" name="upForm"
			id="upForm" enctype="multipart/form-data">
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
									<span class="STYLE4">编辑管理员信息</span>
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
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
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
													请修改管理员信息
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
													&nbsp;&nbsp;

													<input type="hidden" value="${admin.id}" id="aid"
														name="admin.id" />
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
													<input type="text" name="admin.adminId"
														value="${admin.adminId}">
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
													<input type="text" name="admin.adminName"
														value="${admin.adminName}">
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
													<input type="text" name="admin.adminPwd"
														value="${admin.adminPwd}">
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
													<input type="text" name="admin.roleId"
														value="${admin.roleId}">
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
													<input type="text" name="admin.adminTel"
														value="${admin.adminTel}">
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
														displayFormat="MM/dd/yyyy" toggleType="explode"
														name="admin.adminDate" value="%{admin.adminDate}" />

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
													<input id="upload" title="输入内容" name="fileImage.upload"
														type="file" value="" />
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
													<input type="submit" name="submit" value="保存"
														onclick="return submitUpload()" />
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
