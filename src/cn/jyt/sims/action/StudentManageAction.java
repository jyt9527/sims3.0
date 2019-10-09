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
	 * @Description: ��ѧ����Ϣ��list�ķ�ʽչʾ��jspҳ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentList() {
		ActionContext.getContext().put("studentList",
				studentService.getStudents());
		return "listOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: �鿴������Ϣ
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentInfo() {
		System.out.println("�鿴������Ϣ");
		// ActionContext.getContext().getSession().put("IF_id",
		// student.getId());
		student = studentService.getOneStudentById(student.getId());
		return "infoOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: ���ѧ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentAdd() {
		System.out.println("��ӳɹ������Ϸ��ع���ҳ��");

		String newFileName = FileUploadUtils.uploadFile(fileImage);
		student.setPhotoPath("upload/" + newFileName);
		studentService.addStudent(student);
		return "addOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: ����ѧ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentUpdate() {
		System.out.println("����Ϊ����ת������ҳ��");
		System.out.println("student.id:" + student.getId());
		// ActionContext.getContext().getSession().put("UP_id",
		// student.getId());
		student = studentService.getOneStudentById(student.getId());
		return "updateTransmit";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: ɾ��ѧ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentDelete() {
		System.out.println("�ɹ�ɾ��ѧ����Ϣ��������ת������ҳ��");
		System.out.println("student.id:" + student.getId());
		studentService.removeStudent(studentService.getOneStudentById(student
				.getId()));
		return "deleteOK";

	}

	/**
	 * 
	 * @Title: adminSave
	 * @Description: ������¹����ѧ��
	 * @return String
	 * @author JYT
	 * @date 2019-3-31����05:19:33
	 */
	public String studentSave() {
		System.out.println("���ڱ��������޸ĵ���Ϣ��������ת������ҳ��");
		if (fileImage == null) {
			System.out.println("���޸�ͼƬ");
			studentService.saveStudent(student);
		} else {
			String newFileName = FileUploadUtils.uploadFile(fileImage);// �����ļ��ϴ�������ķ���ʵ���ϴ��õ��ϴ��ļ�������
			student.setPhotoPath("upload/" + newFileName);
			studentService.saveStudent(student);
		}
		return "saveOK";

	}

	// set��get����
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
