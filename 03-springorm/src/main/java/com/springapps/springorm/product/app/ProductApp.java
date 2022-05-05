package com.springapps.springorm.product.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

public class ProductApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springorm/product/config/config.xml");
    		ProductDao productdao =(ProductDao) context.getBean("productDaoImpl");
    		createProduct(productdao);
    		
    
    }

	private static void createProduct(ProductDao productdao) {
		Product product =new Product();
		product.setId(55);
		product.setName("iWatch");
		product.setDescription("Nice watch");
		product.setPrice(25000);
		int result=productdao.create(product);
		System.out.println("Number of rows inserted :" + result);
	}
    
}
