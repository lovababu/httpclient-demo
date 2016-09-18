package org.avol.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.avol.httpclient"})
public class HttpclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpclientDemoApplication.class, args);
	}
}
