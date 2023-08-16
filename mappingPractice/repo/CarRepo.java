package com.neosoft.mappingPractice.repo;

import com.neosoft.mappingPractice.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,String> {
}
