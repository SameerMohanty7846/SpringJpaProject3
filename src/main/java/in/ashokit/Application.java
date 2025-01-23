package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository us=context.getBean(UserRepository.class);
		User u=new User(1,"ALOK","ALOK123");
		us.save(u);
		System.out.println("Data Inserted SUCCESSFULLY");
	}

}
