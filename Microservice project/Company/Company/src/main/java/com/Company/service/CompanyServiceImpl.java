package com.Company.service;

import com.Company.repo.CompanyRepo;
import com.Company.entity.Company;
import com.Company.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl {
    @Autowired
    private CompanyRepo repo;

    public Company create(Company company) {
        Company save = repo.save(company);
        return save;
    }


    public List<Company> getAll() {
        List<Company> all = repo.findAll();

        return all;
    }


    public Company getSingleCompany(String id) {
        Company company = repo.findById(id).orElseThrow
                (() -> new ResourceNotFoundException("given id not found" + id));


        return company;
    }
}
