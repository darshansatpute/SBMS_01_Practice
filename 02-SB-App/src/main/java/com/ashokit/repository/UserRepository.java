package com.ashokit.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public UserRepository() {
		System.out.println("*** UserRepository :: Constructor *** ");
	}
}
