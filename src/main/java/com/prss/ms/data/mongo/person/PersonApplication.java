/**
 * 
 */
package com.prss.ms.data.mongo.person;

/**
 * @author Jeremiah Bopko
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dev1
 *
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
}
