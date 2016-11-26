package ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ac;
	public static void main(String[] args) throws Exception {
		ac = new ClassPathXmlApplicationContext("ref/beans.xml");
		System.out.println(ac.getBean("student.john", Student.class));
		System.out.println(ac.getBean("student.jack", Student.class));
		System.out.println(ac.getBean("student.joe", Student.class));
	}
}
