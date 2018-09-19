package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseTobyApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(CourseTobyApplication.class, args)){
			
		}
	}
	
	//최초 설명 : 강의 시작 1년전쯤 강의함
	/*@Bean
	public CommandLineRunner run() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("run()...");
			}
		}; 
	}*/
	
	//@Autowired UserRepository userRepository;
	
	//현재 추천 하는 방법
	@Bean
	public ApplicationRunner run() {
		/*return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				//userRepository.save();
				System.out.println("run()...");
			}
		};*/
		
		//람다식
		return (args) -> System.out.println("run()...");
	}
}
