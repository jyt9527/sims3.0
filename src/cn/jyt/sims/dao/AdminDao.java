package cn.jyt.sims.dao;

import java.util.List;

import cn.jyt.sims.pojo.Admin;

//���ݷ��ʲ� 1.AdminDao�ӿ�

public interface AdminDao {

	// �õ�һ��Admin�����ݲ���String userName, String passWord��������¼
	public Admin getOneAdmin(String userName, String passWord);

	//
	public Admin getOneAdmin(String userName);

	// �õ�����Admin�����ô��ݲ������õ����н����
	// ���������࣬���������ַ���
	public List<Admin> getAllAdmins();

	public Admin getOneAdmin(int id);

	public void updateAdmin(Admin admin);// ���¶���

	public void addAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

}
