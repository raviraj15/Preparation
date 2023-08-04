package com.CompanyRating.service;

import com.CompanyRating.entity.Rating;
import com.CompanyRating.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepo repo;
    @Override
    public Rating CreateRating(Rating rating) {

        String string = UUID.randomUUID().toString();
        rating.setRatingId(string);
        Rating save = repo.save(rating);
        return save;
    }

    @Override
    public List<Rating> getAllRating() {
        return repo.findAll();
    }

    @Override
    public List<Rating> getAllRatingByEmployee(String id) {

        return repo.findByEmployeeId(id);
    }

    @Override
    public List<Rating> getAllRatingByCompany(String id) {
        return repo.findByCompanyId(id);
    }
}
