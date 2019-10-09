package cn.jyt.sims.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cn.jyt.sims.dao.StudentDao;
import cn.jyt.sims.pojo.Student;
import cn.jyt.utils.HibernateUtils;

/**
 * 
 * @ClassName: StudentDaoImpl
 * @Description: 使用spring的JdbcTemplate实现的dao层
 * @author: JYT
 * @date: 2019-4-20 下午08:09:57
 */
public class StudentDaoImpl implements StudentDao {
	// 引入SessionFactory接口:SessionFactory接口负责初始化Hibernate。
	private SessionFactory sessionFactory;
	// 引入JdbcTemplate，Spring对数据库的操作在jdbc上面做了深层次的封装，效率很高。
	private JdbcTemplate jdbcTemplate;

	public void addStudent(Student student) {
		// 2、参数形式插入语句
		jdbcTemplate.update(
				"insert into tab_student values(?, ?, ?, ?, ?, ?, ?,)",
				new Object[] { student.getId(), student.getStudentId(),
						student.getStudentName(), student.getPlace(),
						student.getPhone(), student.getMajorid(),
						student.getPhotoPath()});
	}

	public void deleteStudent(Student student) {
		String sql = "delete from tab_student where id=?";
		jdbcTemplate.update(sql, new Object[] { student.getId() });
	}

	public List<Student> getAllStudents() {
		String sql = "select * from tab_student where id > ?";
		// 使用spring自带的策略者
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(
				Student.class);
		// query查询多行
		List<Student> studentList = jdbcTemplate.query(sql, rowMapper, 0);// 最后一个参数为id值
		return studentList;
	}

	public Student getOneStudent(String userName, String passWord) {
		String sql = "select * from tab_student where studentid = ? and studentname = ?";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(
				Student.class);
		// queryForObject查询单行
		Student student = jdbcTemplate.queryForObject(sql, rowMapper, userName,
				passWord);
		return student;
	}

	public Student getOneStudent(int id) {
		String sql = "select * from tab_student where id = ?";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(
				Student.class);
		// queryForObject查询单行
		Student student = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return student;
	}

	public Student getOneStudentId(String StudentId) {
		String sql = "select * from tab_student where studentid = ?";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(
				Student.class);
		// queryForObject查询单行
		Student student = jdbcTemplate
				.queryForObject(sql, rowMapper, StudentId);
		return student;
	}

	public void updateStudent(Student student) {
		String sql = "update tab_student set studentid='"
				+ student.getStudentId() + "',studentname='"
				+ student.getStudentName() + "',place='" + student.getPlace()
				+ "',phone='" + student.getPhone() + "',place='"
				+ student.getPlace() + "',majorid='" + student.getMajorid()
				+ "',photopath='" + student.getPhotoPath() + "' where id=?";
		jdbcTemplate.update(sql, new Object[] { student.getId() });
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
