package com.EmployeeService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String customerId;

    private String ratingId;

    private String hotelId;

    private int rating;

    private String feedback;


}