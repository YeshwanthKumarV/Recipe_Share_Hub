package com.yeshh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yeshh.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{

	public User findByEmail(String email);
	

}
