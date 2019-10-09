package cn.jyt.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * �ַ����������
 * 
 * @author jyt
 * 
 */
public class AdvancedCharacterFilter implements Filter {
	// �ַ�����(��ʼ������)
	protected String encoding = null;
	// FilterConfig����
	protected FilterConfig filterConfig = null;

	// ��ʼ������
	public void init(FilterConfig filterConfig) throws ServletException {
		// ��filterConfig��ֵ
		this.filterConfig = filterConfig;
		// �Գ�ʼ��������ֵ
		this.encoding = filterConfig.getInitParameter("encoding");
		System.out.println("encoding=" + encoding);
	}

	// ������������
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// System.out.println("--doFilter() work!");
		// �ж��ַ������Ƿ���Ч
		if (encoding != null) {
			// ����request�ַ�����
			request.setCharacterEncoding(this.encoding);
			// ����response�ַ�����
			response.setContentType("text/html; charset=" + this.encoding);
		}
		// ���ݸ���һ������
		chain.doFilter(request, response);
	}

	// ���ٷ���
	public void destroy() {
		// �ͷ���Դ
		this.encoding = null;
		this.filterConfig = null;
	}
}
