package cn.jyt.sims.testHibernate;

import org.junit.Test;

import cn.jyt.sims.pojo.Student;
import cn.jyt.utils.HibernateUtils;
/**
 * 
 * @ClassName: TestStudent 
 * @Description:��junit����
 * @author: JYT
 * @date: 2019-4-3 ����02:55:44
 */
public class TestStudent {
	@Test
	public void add() {
		Student student = new Student("113", "2016134012", "123",
				"15265431336", "�����");
		HibernateUtils.add(student);
	}
}
