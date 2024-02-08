package com.felipe.desafio.picpaysimplificado;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.desafio.picpaysimplificado.entities.Transaction;
import com.felipe.desafio.picpaysimplificado.entities.User;
import com.felipe.desafio.picpaysimplificado.repository.TransactionRepository;
import com.felipe.desafio.picpaysimplificado.repository.UserRepository;

@SpringBootApplication
public class PicpaySimplificadoApplication {

	@Bean
	public CommandLineRunner onInit(UserRepository rep, TransactionRepository jpa){
		return args->{
			User usuario = new User();
			usuario.setNomeCompleto("José Felipe");
			usuario.setCpf(1234);
			usuario.setEmail("jose@email.com");
			usuario.setSenha("123456");

			rep.save(usuario);

			Transaction transacao = new Transaction();
			transacao.setPagador(usuario);
			transacao.setRecebedor(usuario);
			transacao.setDataTransacao(LocalDateTime.now());
			var valor = new BigDecimal(100);
			transacao.setValor(valor);

			jpa.save(transacao);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(PicpaySimplificadoApplication.class, args);
		System.out.println("*** Success Build ***");
	}

}
