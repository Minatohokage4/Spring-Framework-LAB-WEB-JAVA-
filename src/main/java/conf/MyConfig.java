package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	  @Bean
	  public Student john() {		// id = "john"
	      return new Student(1, "John Rambo");
	  }
	  @Bean(name="jack")			// id = "jack"
	  public Student jackStudent() {
	      return new Student(2, "Jack Ripper");
	  }
	 
}
