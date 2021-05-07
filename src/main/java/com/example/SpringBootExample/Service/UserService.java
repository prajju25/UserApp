package com.example.SpringBootExample.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootExample.Model.LoginRequest;
import com.example.SpringBootExample.Model.User;
import com.example.SpringBootExample.Repository.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	private Long scheduleCount = 0L;
	
	/*
	 * public List<User> findUserByName(String fName){ return
	 * userRepo.findByFirstName(fName); }
	 */

	public void printScheduledInfoLogs() {
		Date date = Calendar.getInstance().getTime();
		DateFormat format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String currentDate = format.format(date);
		scheduleCount++;
		System.out.println("Schedule logging print for count "+scheduleCount+" at "+currentDate);
	}

	public User login(LoginRequest login) {
		Base64.Decoder decoder = Base64.getDecoder();
		String pass = new String(decoder.decode(login.getEncPassword().getBytes()));
		User user = userRepo.findLoginUser(login.getUsername(), pass);
		return user;
	}
}
