package com.springapps.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result =(Integer) hibernateTemplate.save(product);
		return result;
	}


}
