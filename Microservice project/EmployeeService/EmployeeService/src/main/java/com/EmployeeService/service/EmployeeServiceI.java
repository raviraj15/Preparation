package com.EmployeeService.service;

import com.EmployeeService.entity.Employee;

import java.util.List;

public interface EmployeeServiceI {

    Employee saveEmployee(Employee employee);

    //get all user
    List<Employee> getAllEmployee();

    //get single user of given userId

    Employee getEmployee(String employeeId);

    //TODO: delete
    void deleteEmployee(String employeeId);

    //TODO: update

    Employee updateEmployee(String id,Employee employee);

    Employee update (String id,Employee employee);
}
