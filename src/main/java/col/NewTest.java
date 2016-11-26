package col;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewTest {
	private static ApplicationContext ac;
	public static void main(String[] args) throws Exception {
		ac = new ClassPathXmlApplicationContext("col/new.xml");
		
		ArrayList<?> as =  ac.getBean("list.strings", ArrayList.class);
		for (Object s : as)
			System.out.print(s + ", ");
		System.out.println();
		
	}
}
