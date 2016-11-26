package col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ac;
	public static void main(String[] args) throws Exception {
		ac = new ClassPathXmlApplicationContext("col/bean.xml");
		
		ArrayList<?> as =  ac.getBean("string.array", ArrayList.class);
		for (Object s : as)
			System.out.print(s + ", ");
		System.out.println();
		
		ArrayList<?> an = ac.getBean("name.array", ArrayList.class);
		for (Object n : an)
			System.out.print(n + ", ");
		System.out.println();
		
		Map<?,?> m = ac.getBean("email.map", HashMap.class);
		for (Entry<?, ?> e : m.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}
