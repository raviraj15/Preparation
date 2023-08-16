package com.neosoft.mappingPractice.repo;

import com.neosoft.mappingPractice.entity.Category;
import com.neosoft.mappingPractice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
