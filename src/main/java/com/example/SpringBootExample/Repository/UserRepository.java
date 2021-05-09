package com.example.SpringBootExample.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.SpringBootExample.Model.UserTable;

public interface UserRepository extends CrudRepository<UserTable, Long> {
	
	/*
	 * @Query("select u from user u where u.userName=:firstName") List<User>
	 * findByFirstName(String firstName);
	 */

	@Query("select u from UserTable u where u.userName=:username and u.password=:pass")
	UserTable findLoginUser(@Param("username") String username,@Param("pass")  String pass);
}
