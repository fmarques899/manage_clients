package com.coop.cooperforte.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coop.cooperforte.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByUsername(String username);
	
}
