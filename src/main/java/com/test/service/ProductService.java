package com.test.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Product;
import com.test.persistence.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository; 
	
	public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product stock) {
        return productRepository.save(stock);
    }

    public void deleteById(Long id) {
    	productRepository.deleteById(id);
    }
    
    public Optional<Product> findByName(String name){
    	return productRepository.findByName(name);
    }
    
    public List<Product> findByPrice(BigDecimal price){
    	return productRepository.findByPrice(price);
    }
}
