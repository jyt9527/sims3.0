package cn.jyt.utils;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import cn.jyt.sims.pojo.FileImage;



/**
 * 
 * @ClassName: FileUploadUtils
 * @Description: �ļ��ϴ�������
 * @author: JYT
 * @date: 2019��4��5�� ����8:20:30
 */
public class FileUploadUtils {

	/**
	 * 
	 * @Title: uploadFile
	 * @Description: ʵ���ļ��ϴ��Ĺ��ܣ������ϴ����µ��ļ�����
	 * @param fileImage
	 * @return String
	 * @author JYT
	 * @date 2019��4��5������8:27:38
	 */
	public static String uploadFile(FileImage fileImage) {
		// ��ȡҪ�����ļ��е�����·��(����·��)
		String realPath = ServletActionContext.getServletContext().getRealPath(
				"/upload");
		System.out.println(realPath);
		// ��ȡ��Ψһ�ļ���
		String pic = newFileName(fileImage.getFilename());
		System.out.println(pic);
		try {
			FileUtils.copyFile(fileImage.getFile(), new File(realPath, pic));
			return pic;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			fileImage.getFile().delete();
		}
	}

	// 1. ͨ���ļ�����ȡ��չ��
	private static String getFileExt(String fileName) {
		return FilenameUtils.getExtension(fileName);
	}

	// 2. ����UUID���������Ϊ�µ��ļ���
	private static String newFileName(String fileName) {
		String ext = getFileExt(fileName);
		return UUID.randomUUID().toString() + "." + ext;
	}
}
