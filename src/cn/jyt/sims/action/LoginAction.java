package cn.jyt.sims.action;

import cn.jyt.sims.service.AdminService;
import cn.jyt.sims.service.StudentService;
import cn.jyt.sims.service.impl.AdminServiceImpl;
import cn.jyt.sims.service.impl.StudentServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -4212345266947667819L;
	private String username;
	private String password;
	private String role;// 引入职称选择
	private AdminService adminService;// 引入service层
	private StudentService studentService;

	/**
	 * 
	 * @Title: login
	 * @Description: 用作验证用户登录的方法
	 * @return String
	 * @author JYT
	 * @date 2019-3-22下午09:09:49
	 */
	public String login() {
		if ("admin".equals(role)) {
			if (adminService.isExist(username, password)) {
				ActionContext.getContext().getSession().put("sadmin",
						adminService.getOneAdminByUserName(username));
				System.out.println("goToAdmin");
				return "goToAdmin";

			} else {
				return "failure";
			}
		} else if ("student".equals(role)) {
			if (studentService.isExist(username, password)) {
				System.out.println("goToStudent");
				return "goToStudent";
			} else {
				return "failure";
			}
		} else if ("teacher".equals(role)) {

		}
		return "login";

	}

	// set和get方法
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
