<%@ page language="java" import="java.util.*,cn.jyt.sims.pojo.Student"
	pageEncoding="utf-8"%>
<!-- 引入标签库 -->
<%@ taglib uri="/struts-tags" prefix="s"%>
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
function ConfirmDel() {
	if (confirm("真的要删除吗？")) {
		return true;
	} else {
		return false;
	}
}
</script>
	</head>
	<body>
		<table width="100%" border="0" align="center" cellpadding="0"
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
								<span class="STYLE4">维护学生信息</span>
							</td>
							<td width="381" background="images/tab_05.gif">
							</td>
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
								<table width="99%" border="0" align="center" cellpadding="0"
									cellspacing="1" bgcolor="#c0de98">
									<tr>
										<td width="3%" height="26" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												id
											</div>
										</td>
										<td width="11%" height="26" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												学号
											</div>
										</td>
										<td width="13%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												姓名
											</div>
										</td>
										<td width="16%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												籍贯
											</div>
										</td>
										<td width="16%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												电话
											</div>
										</td>
										<td width="10%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												详细信息
											</div>
										</td>
										<td width="10%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												操作1
											</div>
										</td>
										<td width="10%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2">
												操作2
											</div>
										</td>
										<td width="10%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2">
												操作3
											</div>
										</td>
									</tr>
									<s:iterator var="student" value="#request.studentList"
										status="status">

										<tr>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													<s:property value="#student.id" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE1">
													<s:property value="#student.studentId" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF" class="STYLE2">
												<div align="center" class="STYLE2 STYLE1">
													<s:property value="#student.studentName" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<s:property value="#student.Place" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<s:property value="#student.Phone" />
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<a
														href="studentManage_studentInfo?student.id=<s:property value="#student.id" />">查看</a>
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<a
														href="studentManage_studentUpdate?student.id=<s:property value="#student.id" />">修改</a>
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<a href="admin/studentAdd.jsp">添加</a>
												</div>
											</td>
											<td height="18" bgcolor="#FFFFFF">
												<div align="center" class="STYLE2 STYLE1">
													<a
														href="studentManage_studentDelete?student.id=<s:property value="#student.id" />"
														onclick="javascript:return ConfirmDel();">删除</a>
												</div>
											</td>
										</tr>
									</s:iterator>


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
										<td width="25%" height="29" nowrap="nowrap">
											<span class="STYLE1"> <%--共3条记录，当前第1/2页 --%> </span>
										</td>
										<td width="75%" valign="top" class="STYLE1">
											<div align="right">

												<table width="352" height="20" border="0" cellpadding="0"
													cellspacing="0">
													<%-- 
                <tr>
                  <td width="62" height="22" valign="middle"><div align="right"><a href="user/user!findAll"><img src="images/first.gif" width="37" height="15" /></a> </div></td>
                  <td width="50" height="22" valign="middle"><div align="right"><a href="user/user?currentPage=0"><img src="images/back.gif" width="43" height="15" /></a></div></td>
                  <td width="54" height="22" valign="middle"><div align="right"><a href="user/user?currentPage=2"><img src="images/next.gif" width="43" height="15" /></a></div></td>
                  <td width="49" height="22" valign="middle"><div align="right"><a href="user/user?currentPage=2"><img src="images/last.gif" width="37" height="15" /></a></div></td>
                  
                </tr>
                 --%>
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
	</body>
</html>
