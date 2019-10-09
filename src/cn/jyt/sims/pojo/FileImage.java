package cn.jyt.sims.pojo;

import java.io.File;

/**
 * 
 * @ClassName: FileImage
 * @Description: 上传的文件
 * @author: JYT
 * @date: 2019年4月4日 下午5:11:42
 */
public class FileImage {
	private File file;// 文件
	private String contentType;// 文件类型
	private String filename;// 文件名字

	public File getFile() {
		return file;
	}

	public String getContentType() {
		return contentType;
	}

	public String getFilename() {
		return filename;
	}

	/**
	 * 提倡用这种方法：
	 * 后台的FileImage的所有set方法不能直接生成，要改名，而且前台传的参数为fileImage.upload,不然会报错警告: Error
	 * setting expression 'fileImage.fileFileName' with value '[Ljava.l
	 */
	// set方法可以不用和属性名一样，但是前台传进来时的参数得和set方法名相同。即前台传的参数为fileImage.upload
	public void setUpload(File file) {
		this.file = file;
	}

	public void setUploadContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setUploadFileName(String filename) {
		this.filename = filename;
	}

}
