package io.pragra.learning.springjdbcdemo.api;

import io.pragra.learning.springjdbcdemo.model.Student;
import io.pragra.learning.springjdbcdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentRepo.getAllStudents();
    }
}
