package cn.jyt.sims.service;

import java.util.List;

import cn.jyt.sims.pojo.Student;

public interface StudentService {
	// ÒµÎñÂß¼­²ã

	public boolean isExist(String userName, String passWord);
	
	public boolean isExist(String StudentId);
	
	public List<Student> getStudents();

	public Student getOneStudentById(int id);
	public Student getOneStudentId(String StudentId );
	public void addStudent(Student student);

	public void saveStudent(Student student);

	public void removeStudent(Student student);
}
