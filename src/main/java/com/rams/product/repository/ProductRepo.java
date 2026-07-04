package com.rams.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rams.product.entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer>{
	
	public List<Products> findByProductProductId(Integer productId);
	
	//1) GET product_categories for side menu bar display

	//2) GET products based on category_id

	//3) GET products based on product_name (search functionality)

	//4) GET product by product_id (for product master view)

}
