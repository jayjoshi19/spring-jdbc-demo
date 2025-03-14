package io.pragra.learning.springjdbcdemo.api;

import io.pragra.learning.springjdbcdemo.model.Employee;
import io.pragra.learning.springjdbcdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo repository;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return repository.getEmployees();
    }
}
