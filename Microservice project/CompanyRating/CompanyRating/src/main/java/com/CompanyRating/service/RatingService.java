package com.CompanyRating.service;

import com.CompanyRating.entity.Rating;

import java.util.List;

public interface RatingService {

    public Rating CreateRating(Rating rating);

    List<Rating> getAllRating();

    public List<Rating> getAllRatingByEmployee(String id);

    public List<Rating> getAllRatingByCompany(String id);
}
