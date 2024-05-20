package com.passwordvalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.passwordvalidator.service.ServicePassword;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PasswordvalidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordvalidatorApplication.class, args);

		System.out.println(ServicePassword.isValid("")); // false
		System.out.println(ServicePassword.isValid("aa")); // false
		System.out.println(ServicePassword.isValid("ab")); // false
		System.out.println(ServicePassword.isValid("AAAbbbCc")); // false
		System.out.println(ServicePassword.isValid("AbTp9!foo")); // false
		System.out.println(ServicePassword.isValid("AbTp9!foA")); // false
		System.out.println(ServicePassword.isValid("AbTp9 fok")); // false
		System.out.println(ServicePassword.isValid("AbTp9!fok")); // true

	}

}
