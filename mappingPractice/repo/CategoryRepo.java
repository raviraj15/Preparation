package com.neosoft.mappingPractice.repo;

import com.neosoft.mappingPractice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {
}
