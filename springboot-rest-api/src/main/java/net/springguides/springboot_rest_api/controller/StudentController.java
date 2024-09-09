package net.springguides.springboot_rest_api.controller;

import net.springguides.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {

    /// http://localhost:8080/student

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Shakhaout",
                "Rimon"
        );
        return student;
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Shakahout","Rimon"));
        students.add(new Student(2,"Rupak", "Saha"));
        return students;
    }
}
