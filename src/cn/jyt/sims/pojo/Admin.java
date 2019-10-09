package cn.jyt.sims.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: Admin
 * @Description: 管理员业务bean类
 * @author: JYT
 * @date: 2019-3-22 下午08:48:32
 */
public class Admin implements Serializable {

	private static final long serialVersionUID = -3300920679354290223L;
	private Integer id;// 主键id
	private String adminId;// 管理员id
	private String adminName;// 管理员账号
	private String adminPwd;// 密码
	private String roleId;// 职位
	private String adminTel;// 电话
	private Date adminDate;// 注册日期
	private String photoPath;// 图片地址

	// 无参构造方法
	public Admin() {
		super();

	}

	// 用作new新的对象

	public Integer getId() {
		return id;
	}

	public Admin(String adminId, String adminName, String adminPwd,
			String roleId, String adminTel, Date adminDate) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.roleId = roleId;
		this.adminTel = adminTel;
		this.adminDate = adminDate;
	}

	public Admin(String adminId, String adminName, String adminPwd,
			String roleId, String adminTel, Date adminDate, String photoPath) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.roleId = roleId;
		this.adminTel = adminTel;
		this.adminDate = adminDate;
		this.photoPath = photoPath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getAdminTel() {
		return adminTel;
	}

	public void setAdminTel(String adminTel) {
		this.adminTel = adminTel;
	}

	public Date getAdminDate() {
		return adminDate;
	}

	public void setAdminDate(Date adminDate) {
		this.adminDate = adminDate;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Admin [adminDate=" + adminDate + ", adminId=" + adminId
				+ ", adminName=" + adminName + ", adminPwd=" + adminPwd
				+ ", adminTel=" + adminTel + ", id=" + id + ", roleId="
				+ roleId + "]";
	}

}
