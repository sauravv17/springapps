package com.springapps.springdatajpa.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springapps.springdatajpa.entity.Product;

public interface ProuctRepository extends CrudRepository<Product,Integer>{
	
	List<Product> findByName(String name);
	List<Product> findByPrice(Double d);
	List<Product> findByNameAndPrice(String name , Double d);
	List<Product> findByPriceGreaterThan(Double d);
	
}
