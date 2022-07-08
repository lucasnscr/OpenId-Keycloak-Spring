package com.lucasnscr.securitykeycloack;

import com.lucasnscr.securitykeycloack.model.User;
import com.lucasnscr.securitykeycloack.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SecurityKeycloackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityKeycloackApplication.class, args);
	}

	@Bean
	public ApplicationRunner run(UserRepository userRepository) throws Exception{
		return (ApplicationRunner) -> {
			List<User> users = Arrays.asList(
					new User("Lucas", "123", "lucas@lucas"),
					new User("Bill", "456", "Bill@Bill"),
					new User("Collin", "789", "Collin@Collin")
			);
			userRepository.saveAll(users);
		};
	}
}
