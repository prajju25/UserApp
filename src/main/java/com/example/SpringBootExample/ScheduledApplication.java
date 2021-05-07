package com.example.SpringBootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.SpringBootExample.Service.UserService;

@Component
@EnableAsync
public class ScheduledApplication {
	
	@Autowired
	UserService userService;

	/*
	 * @Async
	 * 
	 * @Scheduled(fixedDelay=300000, initialDelay=300000) public void
	 * scheduleInfoLogs() { System.out.println("Scheduler Started");
	 * userService.printScheduledInfoLogs(); System.out.println("Scheduler Ended");
	 * }
	 */
}
