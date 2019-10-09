package cn.jyt.sims.dao;

import java.util.List;

import cn.jyt.sims.pojo.Admin;

//数据访问层 1.AdminDao接口

public interface AdminDao {

	// 拿到一个Admin，传递参数String userName, String passWord，用作登录
	public Admin getOneAdmin(String userName, String passWord);

	//
	public Admin getOneAdmin(String userName);

	// 拿到所有Admin，不用传递参数，拿到所有结果集
	// 数据量不多，可以用这种方法
	public List<Admin> getAllAdmins();

	public Admin getOneAdmin(int id);

	public void updateAdmin(Admin admin);// 更新对象

	public void addAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

}
