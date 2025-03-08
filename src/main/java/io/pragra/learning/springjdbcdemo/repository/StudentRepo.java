package io.pragra.learning.springjdbcdemo.repository;

import io.pragra.learning.springjdbcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents(){

        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student student = new Student();
                student.setStudentId(rs.getInt("STUDENT_ID"));
                student.setFirstName(rs.getString("FIRST_NAME"));
                student.setLastName(rs.getString("LAST_NAME"));
                student.setEmail(rs.getString("EMAIL_ID"));

                return student;
            }
        };

        List<Student> studentList = jdbcTemplate.query("SELECT * FROM STUDENT", rowMapper);
        System.out.println(studentList);
        return studentList;
    }
}
