/*
 * @(#MSPersonApplication.java 04/24/2023
 * Copyright 2023 fyi searches, Inc. All rights reserved.
 * FYI Searches/CONFIDENTIAL
 * */

package teach.redbinaria.language.ms;


// Packages and classes to import of spring cloud.
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// Packages and classes to import of springboot.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 *  <p>This class is the service's bootstrap.
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @since 17
 *  @see SpringApplication
 *  @see EnableDiscoveryClient
 *  @see Slf4j
 *  @see EnableCaching
 * */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableCaching
public class MSLanguageApplication {

	// Public static method declarations.
	/**
	 *
	 *  <p>Starting method.
	 *
	 *  @param  args Arguments.
	 * */
	public static void main(String[] args) {

		// Get starting.
        SpringApplication.run(MSLanguageApplication.class, args);
	}
}