/**
 * 
 */
package com.prss.ms;

/**
 * @author Jeremiah Bopko
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prss.ms.data.mongo.greeting.Greeting;
import com.prss.ms.data.mongo.greeting.GreetingController;

/**
 * @author dev1
 *
 */
@SpringBootApplication
public class MongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRestApplication.class, args);
		GreetingController greetingController = new GreetingController();
		
		Greeting greeting = greetingController.greeting("Spring Boot");
		System.out.println(greeting.getId() + "-" + greeting.getContent());
	}
}
