package cn.jyt.utils;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @ClassName: HibernateUtils
 * @Description: Hibernate3.3版本的工具类
 * @author: JYT
 * @date: 2019-3-19 下午10:09:18
 */
public class HibernateUtils {

	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static Configuration configuration = new Configuration();
	private static org.hibernate.SessionFactory sessionFactory;
	private static String configFile = CONFIG_FILE_LOCATION;
	/* 静态语句块创建SessionFactory对象 */
	static {
		try {
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	private HibernateUtils() {
	}

	/** 获取Session，返回ThreadLocal中的Session实例 */
	public static Session getSession() throws HibernateException {
		Session session = (Session) threadLocal.get();

		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			session = (sessionFactory != null) ? sessionFactory.openSession() : null;
			threadLocal.set(session);
		}

		return session;
	}

	/** 创建Hibernate的SessionFactory对象 */
	public static void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	/** 关闭Session，实例并且把ThreadLocal中的副本清除 */
	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);

		if (session != null) {
			session.close();
		}
	}

	/** 返回SessionFactory的对象 */
	public static org.hibernate.SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setConfigFile(String configFile) {
		HibernateUtils.configFile = configFile;
		sessionFactory = null;
	}

	public static Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * 
	 * @Title: add
	 * @Description:添加任何对象
	 * @param obj void
	 * @author JYT
	 * @date 2019-3-19下午10:14:20
	 */
	public static void add(Object object) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			if (object != null) {
				session.save(object);
			}
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		transaction.commit();
		HibernateUtils.closeSession();
	}

	/**
	 * 
	 * @Title: update
	 * @Description: 更新对象
	 * @param obj void
	 * @author JYT
	 * @date 2019-3-19下午10:19:11
	 */
	public static void update(Object object) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			if (object != null) {
				session.update(object);
			}
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		transaction.commit();
		HibernateUtils.closeSession();
	}

	/**
	 * 
	 * @Title: delete
	 * @Description: 删除对象
	 * @param object void
	 * @author JYT
	 * @date 2019-3-19下午10:21:40
	 */
	public static void delete(Object object) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			if (object != null) {
				session.delete(object);
			}
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		transaction.commit();
		HibernateUtils.closeSession();
	}

	/**
	 * 
	 * @Title: get
	 * @Description:根据主键id获取对象
	 * @param clazz
	 * @param id
	 * @return Object
	 * @author JYT
	 * @date 2019-3-19下午10:25:18
	 */

	public static Object getObject(Class<?> clazz, Serializable id) {
		Session session = HibernateUtils.getSession();
		Object object = (Object) session.get(clazz, id);
		HibernateUtils.closeSession();
		return object;
	}

	
}