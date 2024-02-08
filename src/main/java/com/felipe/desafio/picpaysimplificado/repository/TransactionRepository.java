package com.felipe.desafio.picpaysimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.desafio.picpaysimplificado.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
