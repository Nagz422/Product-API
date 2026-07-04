package com.rams.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rams.product.entity.ProductCategory;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {
	public List<ProductCategory> findByProductCategoryId(Integer categoryId);
}
