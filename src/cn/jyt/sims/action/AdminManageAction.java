package cn.jyt.sims.action;

import cn.jyt.sims.pojo.Admin;
import cn.jyt.sims.pojo.FileImage;
import cn.jyt.sims.service.AdminService;
import cn.jyt.sims.service.impl.AdminServiceImpl;
import cn.jyt.utils.FileUploadUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminManageAction extends ActionSupport {

	private static final long serialVersionUID = 6223398760967019120L;
	private Admin admin;
	private FileImage fileImage;
	private AdminService adminService;

	/**
	 * 
	 * @Title: adminList
	 * @Description: 把用户信息以list的方式展示到jsp页面
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午01:58:47
	 */
	public String adminList() throws Exception {
		// 传参:request
		ActionContext.getContext().put("adminList", adminService.getAdmins());
		return "listOK";

	}

	/**
	 * 
	 * @Title: adminInfo
	 * @Description: 查看个人信息
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午02:28:44
	 */
	public String adminInfo() {
		System.out.println("查看个人信息");
		admin = adminService.getOneAdminById(admin.getId());
		return "infoOK";

	}

	/**
	 * 
	 * @Title: adminAdd
	 * @Description: 添加管理员用户
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午01:59:10
	 */
	public String adminAdd() throws Exception {
		System.out.println(admin.getAdminName());

		System.out.println("添加成功，马上返回管理页面");
		String newFileName = FileUploadUtils.uploadFile(fileImage);
		// 得到上传文件的新名
		admin.setPhotoPath("upload/" + newFileName);

		adminService.addAdmin(admin);

		return "addOK";

	}

	/**
	 * 
	 * @Title: adminUpdate
	 * @Description: 更新管理员用户
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午01:59:17
	 */
	public String adminUpdate() {
		System.out.println("正在为你跳转到更新页面");
		System.out.println("admin.id:" + admin.getId());
		admin = adminService.getOneAdminById(admin.getId());
		return "updateTransmit";

	}

	/**
	 * 
	 * @Title: adminDelete
	 * @Description: 删除管理员用户
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午01:59:23
	 */
	public String adminDelete() throws Exception {
		admin = adminService.getOneAdminById(admin.getId());
		adminService.removeAdmin(admin);
		return "deleteOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 保存更新过后的管理员用户
	 * @return String
	 * @author JYT
	 * @date 2019-3-23下午01:59:28
	 */
	public String adminSave() throws Exception {
		System.out.println("正在保存你所修改的信息，马上跳转到管理页面");

		if (fileImage == null) {
			System.out.println("不修改图片");
			adminService.saveAdmin(admin);
		} else {
			String newFileName = FileUploadUtils.uploadFile(fileImage);// 调用文件上传工具类的方法实现上传得到上传文件的新名
			admin.setPhotoPath("upload/" + newFileName);
			adminService.saveAdmin(admin);
		}

		return "saveOK";

	}

	/**
	 * 
	 * @Title: updateAdminPwd
	 * @Description: 单独修改管理员密码
	 * @return
	 * @throws Exception
	 *             String
	 * @author JYT
	 * @date 2019-4-4下午04:38:17
	 */
	public String updateAdminLogin() throws Exception {

		return "upAdPwd";

	}

	// set和get方法
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public FileImage getFileImage() {
		return fileImage;
	}

	public void setFileImage(FileImage fileImage) {
		this.fileImage = fileImage;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
