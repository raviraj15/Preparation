package com.CompanyRating.controller;

import com.CompanyRating.entity.Rating;
import com.CompanyRating.service.RatingService;

import com.CompanyRating.service.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rating")
public class RatingController {
    @Autowired
    private RatingServiceImpl service;

    @PostMapping("/createRating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        Rating rating1 = service.CreateRating(rating);

        return new ResponseEntity<>(rating1,HttpStatus.CREATED);
    }

    @GetMapping ("/getAllRating")
    public ResponseEntity<List<Rating>> getAllRating()
    {
        List<Rating> allRating = service.getAllRating();

        return new ResponseEntity<>(allRating,HttpStatus.OK);
    }

    @GetMapping ("/getAllRatingByEmployee/{id}")
    public ResponseEntity<List<Rating>> getAllRatingByEmployee(@PathVariable String id)
    {
        List<Rating> allRatingByEmployee = service.getAllRatingByEmployee(id);

        return new ResponseEntity<>(allRatingByEmployee,HttpStatus.OK);
    }

    @GetMapping ("/getAllRatingByCompany/{id}")
    public ResponseEntity<List<Rating>> getAllRatingByCompany(@PathVariable String id)
    {
        List<Rating> allRatingByCompany = service.getAllRatingByCompany(id);


        return new ResponseEntity<>(allRatingByCompany,HttpStatus.OK);
    }
}
