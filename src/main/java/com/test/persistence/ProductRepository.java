package com.test.persistence;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public Optional<Product> findByName(String name);
	
	public List<Product> findByPrice(BigDecimal price);
	
}
