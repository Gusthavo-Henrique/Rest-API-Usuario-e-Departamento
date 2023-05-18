package com.Projeto.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.userdept.entities.User;

public interface UserRepository extends JpaRepository<User , Long>{
	
}
