package com.Company.service;

import com.Company.entity.Company;

import java.util.List;

public interface CompanyService {
    Company create (Company company);

    List<Company> getAll();

    Company getSingleCompany(String id);
}
