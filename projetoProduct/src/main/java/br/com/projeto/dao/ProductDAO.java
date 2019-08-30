package br.com.projeto.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.model.Product;
import br.com.projeto.repository.ProductRepository;

@Service
@Transactional
public class ProductDAO {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> listAll() {
		return repository.findAll();
	}
	
	public Product get(Long id) {
		return repository.findById(id).get();
	}
	
	public void save(Product product) {
		repository.save(product);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
