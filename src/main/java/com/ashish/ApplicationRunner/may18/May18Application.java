package com.ashish.ApplicationRunner.may18;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Using ApplicationRunner
 * @author ashish
 */
@SpringBootApplication
public class May18Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(May18Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Overriding Application Runner");
	}
}
