package anr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ac;
	public static void main(String[] args) throws Exception {
		ac = new ClassPathXmlApplicationContext("anr/bean.xml");
		System.out.print(ac.getBean("student.john", Student.class));
	}
}
