package com.EmployeeService.controller;

import com.EmployeeService.entity.Employee;
import com.EmployeeService.service.EmployeeServiceImpl;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl service;


    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employee1 = service.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employee1);
    }



    @GetMapping("/getSingleEmployee/{employeeId}")
    @CircuitBreaker(name="employeeRatingBreaker",fallbackMethod = "employeeRatingFallback")
    public ResponseEntity<Employee> getSingleEmployee(@PathVariable String employeeId) {

        Employee employee = service.getEmployee(employeeId);
        return ResponseEntity.ok(employee);
    }

    public ResponseEntity<Employee> employeeRatingFallback(String employeeId,Exception ex)
    {
        ex.printStackTrace();
        Employee about = Employee.builder()
                .email("dummy@dummy.com")
                .name("dummy").
                about("this is dummy employee")
                .empId("1234")
                .build();
        return  new ResponseEntity<>(about,HttpStatus.BAD_REQUEST);
    }



    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllUser() {
        List<Employee> allEmployee = service.getAllEmployee();

        return  new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{id}")
    public  ResponseEntity<Employee> updateEmployee(@PathVariable String id,@RequestBody Employee employee)
    {
        Employee employee1 = service.updateEmployee(id,employee);
        return new ResponseEntity<>(employee1,HttpStatus.OK);

    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable String id)
    {
        service.deleteEmployee(id);
        return "employee deleted successfully";
    }

    @PatchMapping ("/update/{id}")
    public  ResponseEntity<Employee> update(@PathVariable String id,@RequestBody Employee employee)
    {
        Employee employee1 = service.update(id,employee);
        return new ResponseEntity<>(employee1,HttpStatus.OK);

    }
}
