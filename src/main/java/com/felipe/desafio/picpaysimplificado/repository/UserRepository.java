package com.felipe.desafio.picpaysimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.desafio.picpaysimplificado.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

    
}
