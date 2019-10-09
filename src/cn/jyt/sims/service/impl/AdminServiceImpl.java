package cn.jyt.sims.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.jyt.sims.dao.AdminDao;

import cn.jyt.sims.pojo.Admin;
import cn.jyt.sims.service.AdminService;

//2、在service层使用事物
//（推荐）在整个类中使用，直接加上@Transactional就行
@Transactional
public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public List<Admin> getAdmins() {
		return adminDao.getAllAdmins();
	}

	public boolean isExist(String userName, String passWord) {
		if (adminDao.getOneAdmin(userName, passWord) != null) {
			return true;
		} else {
			return false;
		}

	}

	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}

	public Admin getOneAdminById(int id) {
		return adminDao.getOneAdmin(id);
	}

	public void removeAdmin(Admin admin) {
		adminDao.deleteAdmin(admin);
	}

	public void saveAdmin(Admin admin) {
		adminDao.updateAdmin(admin);
	}

	public Admin getOneAdminByUserName(String userName) {

		return adminDao.getOneAdmin(userName);
	}

	// 必须有set和get方法
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
}
