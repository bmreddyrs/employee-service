package com.myv.sc.controller;

import com.myv.sc.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @GetMapping("/findall")
    public List<Employee>  getAllEmps() {
        return employeeList;
    }
}
