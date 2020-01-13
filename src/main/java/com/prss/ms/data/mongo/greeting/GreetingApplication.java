package com.prss.ms.data.mongo.greeting;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.prss.ms.data.mongo.greeting.GreetingController;
/**
 * 
 */

/**
 * @author Jeremiah Bopko
 *
 */
@EnableAutoConfiguration
public class GreetingApplication {
	public static void main(String[] args) {
		SpringApplication.run(GreetingController.class, args);
	}
}
