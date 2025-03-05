package io.pragra.learning.springjdbcdemo.api;

import io.pragra.learning.springjdbcdemo.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeeapi")
public class EmployeeController {

    @GetMapping("/goodmorning")
    public String goodMorningGreeting() {
        return "Good morning Employee";
    }

    @GetMapping("goodnight")
    public String goodNightGreeting() {
        return "Good night Employee";
    }

    @GetMapping("/employee")
    public Employee getEmployee() {
        Employee employee = new Employee(10, "Shivam", "Raj", 10000.50, "Marketing", "Market Research Manager");
        return employee;
    }

    //make api printEmp: http-post: accept emp object as requestBody
    @PostMapping("/printEmpDetails")
    public String printEmpDetails(@RequestBody Employee employee) {
        System.out.println(employee);
        return "Full Name : "+employee.getFirstName() + " " + employee.getLastName()
                + "\nDepartment: " + employee.getDepartment() + "\nDesignation: " + employee.getDesignation() + "\nSalary: " + employee.getSalary();
    }

    // make api printname : http - get: accepts name as request param, and print it do similar example but use path variable
    /*@GetMapping("/printEmpName")
    public String printName(@RequestParam String firstName){
        return "Hello, " + firstName;
    }*/

    @GetMapping("/printName/(fn)/(ln)")
    public String printName(@PathVariable("fn") String firstName, @PathVariable("ln") String lastName) {
        return "Welcome, " + firstName + " " + lastName;
    }
}
