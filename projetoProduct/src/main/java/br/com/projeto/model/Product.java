package br.com.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String brand;
	private String madein;
	private String price;
	
	public Product() {
		
	}
	
	public Product(Long id, String nome, String brand, String madein, String price) {
		super();
		this.id = id;
		this.nome = nome;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getMadein() {
		return madein;
	}
	
	public void setMadein(String madein) {
		this.madein = madein;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}	
}
