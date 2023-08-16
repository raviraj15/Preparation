package com.neosoft.mappingPractice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private String categoryId;

    private String categoryName;

    @ManyToMany(mappedBy = "categoryList",cascade = CascadeType.ALL)
    private List<Product> productList=new ArrayList<>();
}
