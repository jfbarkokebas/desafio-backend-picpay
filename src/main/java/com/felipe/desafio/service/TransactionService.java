package com.felipe.desafio.service;

import org.springframework.stereotype.Service;

import com.felipe.desafio.picpaysimplificado.repository.TransactionRepository;

@Service
public class TransactionService {
    
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

   //IMPLEMENTAR OS MÉTODOS...
}
