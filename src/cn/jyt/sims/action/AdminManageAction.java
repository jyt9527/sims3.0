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
	 * @Description: ���û���Ϣ��list�ķ�ʽչʾ��jspҳ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����01:58:47
	 */
	public String adminList() throws Exception {
		// ����:request
		ActionContext.getContext().put("adminList", adminService.getAdmins());
		return "listOK";

	}

	/**
	 * 
	 * @Title: adminInfo
	 * @Description: �鿴������Ϣ
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����02:28:44
	 */
	public String adminInfo() {
		System.out.println("�鿴������Ϣ");
		admin = adminService.getOneAdminById(admin.getId());
		return "infoOK";

	}

	/**
	 * 
	 * @Title: adminAdd
	 * @Description: ��ӹ���Ա�û�
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����01:59:10
	 */
	public String adminAdd() throws Exception {
		System.out.println(admin.getAdminName());

		System.out.println("��ӳɹ������Ϸ��ع���ҳ��");
		String newFileName = FileUploadUtils.uploadFile(fileImage);
		// �õ��ϴ��ļ�������
		admin.setPhotoPath("upload/" + newFileName);

		adminService.addAdmin(admin);

		return "addOK";

	}

	/**
	 * 
	 * @Title: adminUpdate
	 * @Description: ���¹���Ա�û�
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����01:59:17
	 */
	public String adminUpdate() {
		System.out.println("����Ϊ����ת������ҳ��");
		System.out.println("admin.id:" + admin.getId());
		admin = adminService.getOneAdminById(admin.getId());
		return "updateTransmit";

	}

	/**
	 * 
	 * @Title: adminDelete
	 * @Description: ɾ������Ա�û�
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����01:59:23
	 */
	public String adminDelete() throws Exception {
		admin = adminService.getOneAdminById(admin.getId());
		adminService.removeAdmin(admin);
		return "deleteOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: ������¹���Ĺ���Ա�û�
	 * @return String
	 * @author JYT
	 * @date 2019-3-23����01:59:28
	 */
	public String adminSave() throws Exception {
		System.out.println("���ڱ��������޸ĵ���Ϣ��������ת������ҳ��");

		if (fileImage == null) {
			System.out.println("���޸�ͼƬ");
			adminService.saveAdmin(admin);
		} else {
			String newFileName = FileUploadUtils.uploadFile(fileImage);// �����ļ��ϴ�������ķ���ʵ���ϴ��õ��ϴ��ļ�������
			admin.setPhotoPath("upload/" + newFileName);
			adminService.saveAdmin(admin);
		}

		return "saveOK";

	}

	/**
	 * 
	 * @Title: updateAdminPwd
	 * @Description: �����޸Ĺ���Ա����
	 * @return
	 * @throws Exception
	 *             String
	 * @author JYT
	 * @date 2019-4-4����04:38:17
	 */
	public String updateAdminLogin() throws Exception {

		return "upAdPwd";

	}

	// set��get����
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
