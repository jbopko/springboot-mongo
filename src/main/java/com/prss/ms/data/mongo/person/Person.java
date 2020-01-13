/**
 * 
 */
package com.prss.ms.data.mongo.person;
import org.springframework.data.annotation.Id;

/**
 * @author Jeremiah Bopko
 *
 */
public class Person {

	@Id private String id;
	private String firstName;
	private String lastName;
	
	public String getId () {
		return this.id;
	}

	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
}
