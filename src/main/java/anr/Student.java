package anr;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("student.john")
public class Student {
	
	@Value(value="123")
	private int id;
	
	@Resource(name = "name.john")
	private Name name;

	@Override
	public String toString() {
		return id + "," + name.toString();
	}

}
