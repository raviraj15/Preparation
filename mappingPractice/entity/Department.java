package com.neosoft.mappingPractice.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Department {
    @Id
    private String deptId;

    private String deptName;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employee> employees=new ArrayList<>();
}
