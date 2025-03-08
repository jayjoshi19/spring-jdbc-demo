package io.pragra.learning.springjdbcdemo.repository;

import io.pragra.learning.springjdbcdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> getEmployees(){
        // DB code here to fetch the data

        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
                employee.setFirstName(rs.getString("FIRST_NAME"));
                employee.setLastName(rs.getString("LAST_NAME"));
                employee.setEmail(rs.getString("EMAIL_ID"));
                return employee;
            }
        };

        List<Employee> employeeList = jdbcTemplate.query("SELECT * FROM EMPLOYEE", rowMapper);
        System.out.println(employeeList);
        return employeeList;
    }
}
