package com.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.udemy.config.FileStorageConfig;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageConfig.class})
@EnableAutoConfiguration
@ComponentScan
public class ReactWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactWithSpringBootApplication.class, args);
		
		/*BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(16);
		String result = bCryptPasswordEncoder.encode("admin123");
		System.out.println("My hash " + result);*/
	}
}
