package cn.jyt.sims.service;

import java.util.List;

import cn.jyt.sims.pojo.Admin;

public interface AdminService {

	// ÒµÎñÂß¼­²ã
	public boolean isExist(String userName, String passWord);

	public List<Admin> getAdmins();

	public Admin getOneAdminById(int id);

	public Admin getOneAdminByUserName(String userName);

	public void addAdmin(Admin admin);

	public void saveAdmin(Admin admin);

	public void removeAdmin(Admin admin);
}
