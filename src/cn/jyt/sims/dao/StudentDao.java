package cn.jyt.sims.dao;

import java.util.List;

import cn.jyt.sims.pojo.Student;

public interface StudentDao {

	public Student getOneStudent(String userName, String passWord);

	public Student getOneStudentId(String StudentId);

	public List<Student> getAllStudents();

	public Student getOneStudent(int id);

	public void updateStudent(Student student);// 更新对象

	public void addStudent(Student student);

	public void deleteStudent(Student student);

}
