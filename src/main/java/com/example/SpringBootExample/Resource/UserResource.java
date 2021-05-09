package com.example.SpringBootExample.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootExample.Model.LoginRequest;
import com.example.SpringBootExample.Model.UserResponse;

@RestController
@RequestMapping(path="user/")
public interface UserResource {

	@GetMapping("/greet/{name}")
	public String sendGreet(@PathVariable("name") String name);
	
	@PostMapping("/login")
	public UserResponse doLogin(@RequestBody LoginRequest body);
}
