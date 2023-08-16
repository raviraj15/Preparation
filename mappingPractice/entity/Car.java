package com.neosoft.mappingPractice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    @Id
    private String carNo;

    private String carName;

    @OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
    private Person person;
}
