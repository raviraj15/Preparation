package com.neosoft.mappingPractice.repo;

import com.neosoft.mappingPractice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeprtmentRepo extends JpaRepository<Department,String> {
}
