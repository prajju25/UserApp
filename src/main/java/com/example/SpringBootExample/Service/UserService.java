package com.example.SpringBootExample.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootExample.Model.LoginRequest;
import com.example.SpringBootExample.Model.UserTable;
import com.example.SpringBootExample.Model.UserResponse;
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
	
	public void saveInitialUser() {
		userRepo.save(new UserTable(32325L,"Jon","password" ,1, new Date()));
		userRepo.save(new UserTable(32325L,"Robb","password" ,0, new Date()));
		userRepo.save(new UserTable(32325L,"Dan","password" ,0, new Date()));
		userRepo.save(new UserTable(32325L,"Ravi","password" ,0, new Date()));
		userRepo.save(new UserTable(32325L,"Suresh","password" ,1, new Date()));
	}

	public UserResponse login(LoginRequest login) {
		Base64.Decoder decoder = Base64.getDecoder();
		String pass = new String(decoder.decode(login.getEncPassword().getBytes()));
		UserTable user = userRepo.findLoginUser(login.getUsername(), pass);
		UserResponse res = new UserResponse();
		if(user != null) {
			boolean isAdmin = user.isAdmin()==1 ? true:false;
			res.setUserID(user.getUser_id());
			res.setUserName(user.getUserName());
			res.setIsAdmin(isAdmin);
			res.setIsloggedIn(true);
			res.setSessionKey(RandomStringUtils.random(10, true, true));
		}
		return res;
	}
}
