package com.CompanyRating.repo;

import com.CompanyRating.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,String> {

    public List<Rating> findByEmployeeId(String id);

    public List<Rating> findByCompanyId(String id);
}
