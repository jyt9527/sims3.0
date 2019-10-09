package cn.jyt.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 字符编码过滤器
 * 
 * @author jyt
 * 
 */
public class AdvancedCharacterFilter implements Filter {
	// 字符编码(初始化参数)
	protected String encoding = null;
	// FilterConfig对象
	protected FilterConfig filterConfig = null;

	// 初始化方法
	public void init(FilterConfig filterConfig) throws ServletException {
		// 对filterConfig赋值
		this.filterConfig = filterConfig;
		// 对初始化参数赋值
		this.encoding = filterConfig.getInitParameter("encoding");
		System.out.println("encoding=" + encoding);
	}

	// 过滤器处理方法
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// System.out.println("--doFilter() work!");
		// 判断字符编码是否有效
		if (encoding != null) {
			// 设置request字符编码
			request.setCharacterEncoding(this.encoding);
			// 设置response字符编码
			response.setContentType("text/html; charset=" + this.encoding);
		}
		// 传递给下一过滤器
		chain.doFilter(request, response);
	}

	// 销毁方法
	public void destroy() {
		// 释放资源
		this.encoding = null;
		this.filterConfig = null;
	}
}
