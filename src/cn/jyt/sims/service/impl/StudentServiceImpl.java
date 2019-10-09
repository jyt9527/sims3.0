package cn.jyt.sims.service.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import cn.jyt.sims.dao.StudentDao;
import cn.jyt.sims.pojo.Student;
import cn.jyt.sims.service.StudentService;

//2、在service层使用事物
//（推荐）在整个类中使用，直接加上@Transactional就行
@Transactional
public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	

	public boolean isExist(String userName, String passWord) {
		if (studentDao.getOneStudent(userName, passWord) != null) {
			return true;
		} else {
			return false;
		}
		// if ("2016134012".equals(userName) && "123".equals(passWord)) {
		// return true;
		// } else {
		// return false;
		// }
	}

	public List<Student> getStudents() {
		return studentDao.getAllStudents();
	}

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	public Student getOneStudentById(int id) {
		return studentDao.getOneStudent(id);
	}

	public void removeStudent(Student student) {
		studentDao.deleteStudent(student);
	}

	public void saveStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public boolean isExist(String StudentId) {
		if (studentDao.getOneStudentId(StudentId) != null) {
			return true;
		} else {
			return false;
		}
	}

	public Student getOneStudentId(String StudentId) {
		return studentDao.getOneStudentId(StudentId);
	}

	// 必须有set和get方法
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	

}
