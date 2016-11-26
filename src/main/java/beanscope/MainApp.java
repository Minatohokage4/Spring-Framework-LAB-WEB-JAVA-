package beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static ApplicationContext ac;

	public static void main(String[] args) {

		System.out.println("before");
		ac = new ClassPathXmlApplicationContext("beanscope/Beans.xml");
		System.out.println("after");
		HelloWorld obj = (HelloWorld) ac.getBean("helloWorld");
		
		System.err.println("before set message");
		obj.getMessage();
		System.err.println("before set message");
		obj.setMessage("I'm obj");
		System.err.println("after set message");
		obj.getMessage();
		
		System.out.println("Create obj2");
		
		HelloWorld obj2 = (HelloWorld) ac.getBean("helloWorld");
		obj2.getMessage();

	}
}
