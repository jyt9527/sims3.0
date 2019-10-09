package cn.jyt.sims.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: Admin
 * @Description: ����Աҵ��bean��
 * @author: JYT
 * @date: 2019-3-22 ����08:48:32
 */
public class Admin implements Serializable {

	private static final long serialVersionUID = -3300920679354290223L;
	private Integer id;// ����id
	private String adminId;// ����Աid
	private String adminName;// ����Ա�˺�
	private String adminPwd;// ����
	private String roleId;// ְλ
	private String adminTel;// �绰
	private Date adminDate;// ע������
	private String photoPath;// ͼƬ��ַ

	// �޲ι��췽��
	public Admin() {
		super();

	}

	// ����new�µĶ���

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
