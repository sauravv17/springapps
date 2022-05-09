package com.springapps.springdatajpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.springapps.springdatajpa.entity.Product;

public interface ProuctRepository extends CrudRepository<Product,Integer>{

}
