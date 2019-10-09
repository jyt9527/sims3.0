package cn.jyt.sims.testHibernate;

import java.util.Date;

import cn.jyt.sims.pojo.Admin;
import cn.jyt.sims.service.AdminService;
import cn.jyt.sims.service.impl.AdminServiceImpl;
import cn.jyt.utils.HibernateUtils;

/**
 * 
 * @ClassName: TestAdmin
 * @Description: 用传统的main方法测试
 * @author: JYT
 * @date: 2019-4-3 下午02:56:05
 */
public class TestAdmin {
	private static AdminService adminService = new AdminServiceImpl();

	public static void main(String[] args) {
		Admin admin = new Admin("113", "admin", "admin", "admin",
				"17852001205", new Date());
		// HibernateUtils.add(admin);
		adminService.addAdmin(admin);
		// testUpdate(3);
	}

	public static void testUpdate(Integer id) {
		Admin admin = (Admin) HibernateUtils.getObject(Admin.class, id);
		admin.setAdminName("555");
		adminService.saveAdmin(admin);
	}
}
