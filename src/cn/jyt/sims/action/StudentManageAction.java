package cn.jyt.sims.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.jyt.sims.pojo.FileImage;
import cn.jyt.sims.pojo.Student;
import cn.jyt.sims.service.StudentService;
import cn.jyt.sims.service.impl.StudentServiceImpl;
import cn.jyt.utils.FileUploadUtils;

public class StudentManageAction extends ActionSupport {

	private static final long serialVersionUID = 964914845829723580L;
	private Student student;
	private FileImage fileImage;
	private StudentService studentService;

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 把学生信息以list的方式展示到jsp页面
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentList() {
		ActionContext.getContext().put("studentList",
				studentService.getStudents());
		return "listOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 查看个人信息
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentInfo() {
		System.out.println("查看个人信息");
		// ActionContext.getContext().getSession().put("IF_id",
		// student.getId());
		student = studentService.getOneStudentById(student.getId());
		return "infoOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 添加学生
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentAdd() {
		System.out.println("添加成功，马上返回管理页面");

		String newFileName = FileUploadUtils.uploadFile(fileImage);
		student.setPhotoPath("upload/" + newFileName);
		studentService.addStudent(student);
		return "addOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 更新学生
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentUpdate() {
		System.out.println("正在为你跳转到更新页面");
		System.out.println("student.id:" + student.getId());
		// ActionContext.getContext().getSession().put("UP_id",
		// student.getId());
		student = studentService.getOneStudentById(student.getId());
		return "updateTransmit";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 删除学生
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentDelete() {
		System.out.println("成功删除学生信息，马上跳转到管理页面");
		System.out.println("student.id:" + student.getId());
		studentService.removeStudent(studentService.getOneStudentById(student
				.getId()));
		return "deleteOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: 保存更新过后的学生
	 * @return String
	 * @author JYT
	 * @date 2019-3-31下午05:19:33
	 */
	public String studentSave() {
		System.out.println("正在保存你所修改的信息，马上跳转到管理页面");
		if (fileImage == null) {
			System.out.println("不修改图片");
			studentService.saveStudent(student);
		} else {
			String newFileName = FileUploadUtils.uploadFile(fileImage);// 调用文件上传工具类的方法实现上传得到上传文件的新名
			student.setPhotoPath("upload/" + newFileName);
			studentService.saveStudent(student);
		}
		return "saveOK";

	}

	// set和get方法
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public FileImage getFileImage() {
		return fileImage;
	}

	public void setFileImage(FileImage fileImage) {
		this.fileImage = fileImage;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
