/**
 * 
 */
package com.prss.ms.data.mongo.greeting;

/**
 * @author dev1
 *
 */
public class Greeting {

	private final long id;
	private final String content;

	/**
	 * 
	 * @param id
	 * @param content
	 */
	public Greeting (long id, String content) {
		this.id = id;
		this.content = content;
	}

	/**
	 * Return the id attribute
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * Return the content attribute
	 * @return
	 */
	public String getContent () {
		return content;
	}
}
