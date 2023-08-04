package com.Company.controller;

import com.Company.entity.Company;
import com.Company.service.CompanyServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyServiceImpl service;
    @PostMapping("/addCompany")
    public ResponseEntity<Company> addCompany(@RequestBody Company company)
    {
        String random = UUID.randomUUID().toString();
        company.setId(random);
        Company company1 = service.create(company);

        return ResponseEntity.status(HttpStatus.CREATED).body(company1);
    }

    @GetMapping ("getComapny/{id}")
    public ResponseEntity<Company> getSingleCompany(@PathVariable String id)
    {
        Company singleCompany= service.getSingleCompany(id);

        return ResponseEntity.status(HttpStatus.OK).body(singleCompany);
    }

    @GetMapping ("/getAllCompany")
    public ResponseEntity <List<Company>> getAll()
    {
        List<Company> all = service.getAll();

        return ResponseEntity.status(HttpStatus.OK).body(all);
    }
}
