package anr;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("name.john")	
public class Name {
	
	@Resource(name = "john")
	protected String first;
	
	@Value(value = "Rambo")
	protected String last;
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	@Override
	public String toString() {
		return first + " " + last;
	}

}
