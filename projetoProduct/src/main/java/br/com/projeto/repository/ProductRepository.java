package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.model.*;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
