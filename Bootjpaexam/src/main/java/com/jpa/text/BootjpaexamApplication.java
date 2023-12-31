package com.jpa.text;
import com.jpa.text.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaexamApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexamApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
	
		User user = new User();
		user.setName("Blue Falcon");
		user.setCity("Delhi");
		User user1 = userRepository.save(user);
		System.out.print(user1);
	}

}
