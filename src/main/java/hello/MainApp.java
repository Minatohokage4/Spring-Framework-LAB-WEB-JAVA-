package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanscope.HelloWorld;

public class MainApp {
	private static ApplicationContext ac;

	public static void main(String[] args) {

		System.out.println("before");
		ac = new ClassPathXmlApplicationContext("hello/bean.xml");
		System.out.println("after");
		HelloWorld obj = (HelloWorld)ac.getBean("helloWorld");

		obj.getMessage();

	}
}
