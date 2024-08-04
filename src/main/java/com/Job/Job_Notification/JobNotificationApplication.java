package com.Job.Job_Notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JobNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobNotificationApplication.class, args);
	}

}
