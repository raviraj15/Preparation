package com.EmployeeService.service;

import com.EmployeeService.entity.Employee;
import com.EmployeeService.entity.Rating;
import com.EmployeeService.exception.ResourceNotFound;
import com.EmployeeService.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

    @Autowired
    private EmployeeRepo repo;
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Employee saveEmployee(Employee employee) {
        String string = UUID.randomUUID().toString();
        employee.setEmpId(string);
       return repo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployee(String employeeId) {

        Employee employee = repo.findById(employeeId).orElseThrow(() -> new
                ResourceNotFound("Cutomer with given id is not found on server !! : " + employeeId));

        ArrayList ratings = restTemplate.getForObject
                ("http://COMPANY-RATING/Rating/getAllRatingByEmployee/ "+employee.getEmpId()
                , ArrayList.class);


     //   ArrayList< Rating> ratings = ratingService.getRating(employee.getEmpId());
        employee.setRatings(ratings);
        return employee;
    }

    @Override
    public void deleteEmployee(String employeeId) {

        repo.deleteById(employeeId);

    }

    @Override
    public Employee updateEmployee(String id,Employee employee) {
        employee.setEmpId(id);
       return repo.save(employee);


    }

    @Override
    public Employee update(String id, Employee employee) {
        Employee existing = repo.findById(id).get();
        if(employee.getName()!=null)
        {
            existing.setName(employee.getName());
        }
        if(employee.getEmail()!=null)
        {
            existing.setEmail(employee.getEmail());
        }
        if(employee.getAbout()!=null)
        {
            existing.setAbout(employee.getAbout());
        }


        Employee save = repo.save(existing);

        return save;
    }
}
