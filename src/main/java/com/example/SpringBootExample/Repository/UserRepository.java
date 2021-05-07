package com.example.SpringBootExample.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootExample.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	/*
	 * @Query("select u from user u where u.userName=:firstName") List<User>
	 * findByFirstName(String firstName);
	 */

	@Query("select u from user u where u.userName=:username and u.password=:pass")
	User findLoginUser(String username, String pass);
}
