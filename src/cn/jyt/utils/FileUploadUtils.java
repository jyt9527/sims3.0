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
 * @Description: 文件上传工具类
 * @author: JYT
 * @date: 2019年4月5日 下午8:20:30
 */
public class FileUploadUtils {

	/**
	 * 
	 * @Title: uploadFile
	 * @Description: 实现文件上传的功能，返回上传后新的文件名称
	 * @param fileImage
	 * @return String
	 * @author JYT
	 * @date 2019年4月5日下午8:27:38
	 */
	public static String uploadFile(FileImage fileImage) {
		// 获取要保存文件夹的物理路径(绝对路径)
		String realPath = ServletActionContext.getServletContext().getRealPath(
				"/upload");
		System.out.println(realPath);
		// 获取新唯一文件名
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

	// 1. 通过文件名获取扩展名
	private static String getFileExt(String fileName) {
		return FilenameUtils.getExtension(fileName);
	}

	// 2. 生成UUID随机数，作为新的文件名
	private static String newFileName(String fileName) {
		String ext = getFileExt(fileName);
		return UUID.randomUUID().toString() + "." + ext;
	}
}
