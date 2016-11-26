package din;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ac;
	public static void main(String[] args)  {
		
		System.out.println("before");
		ac = new ClassPathXmlApplicationContext("din/Beans.xml");
		System.out.println("after");
		
		System.out.println(ac.getBean("student.john", Student.class));
		System.out.println(ac.getBean("student.jack", Student.class));
		System.out.println(ac.getBean("student.joe", Student.class));
	}
}

