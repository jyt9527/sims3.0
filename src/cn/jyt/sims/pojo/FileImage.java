package cn.jyt.sims.pojo;

import java.io.File;

/**
 * 
 * @ClassName: FileImage
 * @Description: �ϴ����ļ�
 * @author: JYT
 * @date: 2019��4��4�� ����5:11:42
 */
public class FileImage {
	private File file;// �ļ�
	private String contentType;// �ļ�����
	private String filename;// �ļ�����

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
	 * �ᳫ�����ַ�����
	 * ��̨��FileImage������set��������ֱ�����ɣ�Ҫ����������ǰ̨���Ĳ���ΪfileImage.upload,��Ȼ�ᱨ����: Error
	 * setting expression 'fileImage.fileFileName' with value '[Ljava.l
	 */
	// set�������Բ��ú�������һ��������ǰ̨������ʱ�Ĳ����ú�set��������ͬ����ǰ̨���Ĳ���ΪfileImage.upload
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
