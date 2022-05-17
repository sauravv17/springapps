package com.springapps.springdatajpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springapps.springdatajpa.entity.Product;
import com.springapps.springdatajpa.repos.ProuctRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext context;
	
// more keywords in https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	
//	@Test
	void saveProduct() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		Product product = new Product(2, "xx", "xxyz", 500);
	}
	
//	@Test
//	save all products
	void saveAllProduct() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		Product product = new Product(1, "xx", "xxyz", 500);
		Product product2 = new Product(5, "xxyz", "xxyz", 515);
		Product product3 = new Product(6, "xyyz", "xyyz", 525);
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		products.add(product2);
		products.add(product3);
		
		repo.saveAll(products);
	}
	
//	@Test
	void updateProduct() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		Product product = new Product(1, "x", "xyz", 5000);
		repo.save(product);
	}

//	@Test
//	find by id
	void readProduct() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);
//		optional product means product is getting ready 
//		or being fetched and will be fetched from db 
//		if any product is present
		Optional<Product> optionalProduct = repo.findById(1);
		Product product =null;
		if (optionalProduct.isPresent()) {
			product=optionalProduct.get();
		}
		System.out.println(product);
	}
	
//	@Test
//	find by name
	void findByName() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		List<Product> products = (List<Product>) repo.findByName("xx");
		System.out.println(products);
	}
	
//	@Test
//	find by price
	void findByPrice() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		List<Product> products = (List<Product>) repo.findByPrice(500d);
		System.out.println(products);
	}

//	@Test
//	find by price greater than
	void findByPriceGreaterThan() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		List<Product> products = (List<Product>) repo.findByPriceGreaterThan(500d);
		System.out.println(products);
	}
	
//	@Test
//	find by two parameter
	void findByNameAndPrice() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		List<Product> products = (List<Product>) repo.findByNameAndPrice("xx" ,500d);
		System.out.println(products);
	}
	
//	@Test
//	find all
	void readAllProducts() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);

		List<Product> products = (List<Product>) repo.findAll();
		System.out.println(products);
	}

//	@Test
	void deleteProduct() {
		ProuctRepository repo = context.getBean(ProuctRepository.class);
		Optional<Product> optionalProduct = repo.findById(1);
		Product product =null;
		if (optionalProduct.isPresent()) {
			product=optionalProduct.get();
		}
		repo.delete(product);
	}
}
