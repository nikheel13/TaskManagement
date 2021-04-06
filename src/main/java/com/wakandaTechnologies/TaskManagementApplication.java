package com.wakandaTechnologies;


import com.wakandaTechnologies.models.User;
import com.wakandaTechnologies.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementApplication implements  CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {


		//default Admin login credentials
		{
			User newAdmin = new User("admin@mail.com", "Admin", "123456");
			userService.createAdmin(newAdmin);
		}
	}
}

