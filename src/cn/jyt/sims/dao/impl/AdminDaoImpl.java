package cn.jyt.sims.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.jyt.sims.dao.AdminDao;
import cn.jyt.sims.pojo.Admin;

/**
 * 
 * @ClassName: AdminDaoImpl
 * @Description:ʹ��HibernateTemplate��һϵ�з���ʵ��dao��
 * @author: JYT
 * @date: 2019-4-20 ����08:01:55
 */
public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public void addAdmin(Admin admin) {
		getHibernateTemplate().save(admin);
	}

	public void deleteAdmin(Admin admin) {
		getHibernateTemplate().delete(admin);
	}

	@SuppressWarnings("unchecked")
	public List<Admin> getAllAdmins() {
		return getHibernateTemplate().find("from Admin");
	}

	public Admin getOneAdmin(final String userName, final String passWord) {
		// hql��ѯ
		return getHibernateTemplate().execute(new HibernateCallback<Admin>() {

			public Admin doInHibernate(Session session)
					throws HibernateException {
				String hql = "from Admin where adminName = ? and adminPwd = ? ";
				Query query = session.createQuery(hql);
				query.setParameter(0, userName);
				query.setParameter(1, passWord);
				// �����ѯ���ض��ֵ��list()����
				// ��ȷ�����ص�ʵ��ֻ��һ������nullʱ ��uniqueResult()����
				Admin admin = (Admin) query.uniqueResult();
				return admin;
			}
		});
	}

	public Admin getOneAdmin(final int id) {
		return getHibernateTemplate().execute(new HibernateCallback<Admin>() {

			public Admin doInHibernate(Session session)
					throws HibernateException {
				String hql = "from Admin where id = ?  ";
				Query query = session.createQuery(hql);
				query.setParameter(0, id);
				// �����ѯ���ض��ֵ��list()����
				// ��ȷ�����ص�ʵ��ֻ��һ������nullʱ ��uniqueResult()����
				Admin admin = (Admin) query.uniqueResult();
				return admin;
			}
		});
	}

	public void updateAdmin(Admin admin) {
		getHibernateTemplate().update(admin);

	}

	public Admin getOneAdmin(final String userName) {
		return getHibernateTemplate().execute(new HibernateCallback<Admin>() {

			public Admin doInHibernate(Session session)
					throws HibernateException {
				String hql = "from Admin where adminName = ?  ";
				Query query = session.createQuery(hql);
				query.setParameter(0, userName);
				// �����ѯ���ض��ֵ��list()����
				// ��ȷ�����ص�ʵ��ֻ��һ������nullʱ ��uniqueResult()����
				Admin admin = (Admin) query.uniqueResult();
				return admin;
			}
		});
	}

}
