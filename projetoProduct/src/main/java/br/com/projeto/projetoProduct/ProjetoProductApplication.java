package br.com.projeto.projetoProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan(basePackages = "br.com.projeto.model")
@ComponentScan(basePackages = {"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.projeto.repository"})
@EnableTransactionManagement
@SpringBootApplication
public class ProjetoProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoProductApplication.class, args);
	}

}
