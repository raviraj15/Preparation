package com.neosoft.mappingPractice;

import com.neosoft.mappingPractice.entity.*;
import com.neosoft.mappingPractice.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MappingPracticeApplication implements CommandLineRunner {

	@Autowired
	private CarRepo repo;

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private DeprtmentRepo deprtmentRepo;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//many to many

		Category category1 = new Category();
		category1.setCategoryId("1");
		category1.setCategoryName("Electronics");

		Category category2 = new Category();
		category2.setCategoryId("2");
		category2.setCategoryName("Appliances");

		Product product1 = new Product();
		product1.setProductId("11");
		product1.setProductName("mobile");

		Product product2 = new Product();
		product2.setProductId("11");
		product2.setProductName("mobile");

		List<Product> category1productList = category1.getProductList();
		category1productList.add(product1);
		category1productList.add(product2);

		List<Product> category2productList = category2.getProductList();
		category2productList.add(product1);
		category2productList.add(product2);

	productRepo.save(product1);
		productRepo.save(product2);


	/*//one to many

		Department department1 = new Department();
		department1.setDeptId("1");
		department1.setDeptName("ADMIN");

		Department department2 = new Department();
		department2.setDeptId("2");
		department2.setDeptName("DEVLOPPER");


		Employee employee1 = new Employee();
		employee1.setEmpId("1012");
		employee1.setEmpName("raviraj");


		Employee employee2 = new Employee();
		employee2.setEmpId("1014");
		employee2.setEmpName("sandip");

		Employee employee3 = new Employee();
		employee3.setEmpId("1017");
		employee3.setEmpName("sumit");

		Employee employee4 = new Employee();
		employee4.setEmpId("1045");
		employee4.setEmpName("mane");

		List<Employee> employees1 = department1.getEmployees();
		employees1.add(employee4);
		employees1.add(employee3);


		List<Employee> employees2 = department2.getEmployees();
		employees2.add(employee2);
		employees2.add(employee1);

		employee1.setDepartment(department2);
		employee2.setDepartment(department2);
		employee3.setDepartment(department1);
		employee4.setDepartment(department1);

		*//*employeeRepo.save(employee1);
		employeeRepo.save(employee2);
		employeeRepo.save(employee3);
		employeeRepo.save(employee4);*//*
		deprtmentRepo.save(department1);
		deprtmentRepo.save(department2);*/



		//one to one
		/*Person person1 = new Person();
		person1.setPersonId("101");
		person1.setPersonName("raviraj");

		Person person2 = new Person();
		person2.setPersonId("102");
		person2.setPersonName("akshay");

		Car car1 = new Car();
		car1.setCarNo("1234");
		car1.setCarName("BMW");

		Car car2 = new Car();
		car2.setCarNo("5678");
		car2.setCarName("AUDI");
		person1.setCar(car1);
		person2.setCar(car2);

		car1.setPerson(person1);
		car2.setPerson(person2);

		repo.save(car1);
		repo.save(car2);*/
	}
}
