package com.example.myweb.repository;

import com.example.myweb.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepoImpl {

    public List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setName("thatiskan");
        employee.setAge(26);
        employees.add(employee);
        return employees;
    }
}
