package com.springapps.springorm.product.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

public class ProductApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springorm/product/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		// createProduct(productdao);
		// updateProduct(productdao);
		// deleteProduct(productdao);
		//findProduct(productdao);
		findAllProduct(productdao);

	}

	private static void findAllProduct(ProductDao productdao) {
		List<Product> products = productdao.findAll();
		System.out.println(products);

	}

	private static void findProduct(ProductDao productdao) {
		Product product = productdao.find(3);
		System.out.println(product);
	}

	private static void deleteProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		productdao.delete(product);
		System.out.println("row deleted");

	}

	private static void updateProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("Nice watch");
		product.setPrice(250);
		productdao.update(product);
		System.out.println("Id of row updated");

	}

	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(55);
		product.setName("iWatch");
		product.setDescription("Nice watch");
		product.setPrice(25000);
		int result = productdao.create(product);
		System.out.println("Id of row created :" + result);
	}

}
