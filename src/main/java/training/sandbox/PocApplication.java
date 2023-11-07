/*
 * @(#PocApplication.java 09/15/2023
 * Copyright 2023 sandbox searches, Inc. All rights reserved.
 * Sandbox Searches/CONFIDENTIAL
 * */

package training.sandbox;


// Packages and classes to import of springboot.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 *  <p>This class is the service's bootstrap.
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @since 8
 *  @see SpringApplication
 * */
@SpringBootApplication
public class PocApplication {

	// Public static method declarations.
	/**
	 *
	 *  <p>Starting method.
	 *
	 *  @param  args Arguments.
	 * */
	public static void main(String[] args) {

		// Get starting.
		SpringApplication.run(PocApplication.class, args);
	}
}