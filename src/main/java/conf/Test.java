package conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	private static AnnotationConfigApplicationContext ac;
	
	public static void main(String[] args) {
		
		ac = new AnnotationConfigApplicationContext(MyConfig.class);

		Student s = ac.getBean("john", Student.class);
		System.out.println(s);
		
		s = ac.getBean("jack", Student.class);
		System.out.println(s);
	}
}
