package cn.jyt.sims.pojo;

import java.io.Serializable;

/**
 * 
 * @ClassName: Student
 * @Description: 学生业务bean类
 * @author: JYT
 * @date: 2019-3-22 下午08:47:57
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 1604261793850801022L;
	private Integer Id;// 主键id
	private String studentId;// 学号
	private String studentName;// 姓名
	private String Place;// 居住地
	private String Phone;// 联系电话
	private String Majorid;// 所修专业
	private String photoPath;// 图片地址

	// 无参构造方法
	public Student() {
		super();
	}

	// 用作new新的对象

	public Student(String studentId, String studentName, String place,
			String phone, String majorid) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Place = place;
		Phone = phone;
		Majorid = majorid;

	}

	public Student(String studentId, String studentName, String place,
			String phone, String majorid, String photoPath) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Place = place;
		Phone = phone;
		Majorid = majorid;
		this.photoPath = photoPath;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getMajorid() {
		return Majorid;
	}

	public void setMajorid(String majorid) {
		Majorid = majorid;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Majorid=" + Majorid + ", Phone="
				+ Phone + ", Place=" + Place + ", photoPath=" + photoPath
				+ ", studentId=" + studentId + ", studentName=" + studentName
				+ "]";
	}

}
