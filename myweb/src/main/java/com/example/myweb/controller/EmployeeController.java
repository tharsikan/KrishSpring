package com.example.myweb.controller;

import com.example.myweb.entity.Employee;
import com.example.myweb.repository.EmployeeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class EmployeeController {
    @Autowired
    EmployeeRepoImpl employeeRepo;

    @RequestMapping(path = "/employee",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
    public List<Employee> getEmployees(){
        return employeeRepo.getAllEmployee();
    }
}
