package com.SpringSecurity.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityProjectApplication {


	/**
	 *
	 *
	 * Access the home page at http://localhost:8080.
	 * Use the login page at http://localhost:8080/login to authenticate.
	 *
	 * @param args
	 */

	public static void main(String[] args)
	{
		SpringApplication.run(SpringSecurityProjectApplication.class, args);
	}

}
