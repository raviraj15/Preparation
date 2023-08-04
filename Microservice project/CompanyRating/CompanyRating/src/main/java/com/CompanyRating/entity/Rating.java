package com.CompanyRating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Rating {

    @Id
    private String ratingId;

    private String employeeId;

    private String companyId;

    private int rating;

    private String feedback;
}
