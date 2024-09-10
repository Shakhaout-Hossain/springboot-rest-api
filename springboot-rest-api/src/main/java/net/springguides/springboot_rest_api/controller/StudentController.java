package net.springguides.springboot_rest_api.controller;

import net.springguides.springboot_rest_api.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")

public class StudentController {

    /// http://localhost:8080/student

    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(
                1,
                "Shakhaout",
                "Rimon"
        );
        return ResponseEntity.ok(student);
        //return new ResponseEntity<>(student,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity< List<Student> > getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Shakahout","Rimon"));
        students.add(new Student(2,"Rupak", "Saha"));
        return ResponseEntity.ok(students);
    }
    //SpringBoot rest api with path variable
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student>  studentPathVariable(@PathVariable("id") int StudentId,
                                      @PathVariable("first-name") String firstName, @PathVariable("last-name") String lastName){
        Student student = new Student(StudentId, firstName,lastName) ;
        return  ResponseEntity.ok(student);
    }
    // Spring Boot Rest Api with Request Param

    //http://localhost:8080/students/query?id=1&firstName=Shakhaout&lastName=Rimon
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        Student student =  new Student(id,firstName,lastName);
        return  ResponseEntity.ok(student);
    }
    ///Spring Boot Rest Api that handle http post request- create Request
    /// @Postmapping and @RequestBody
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return  ResponseEntity.ok(student);
    }
    //Spring Boot Rest Api that handle http post request - update Request
    @PutMapping("{id}/update")

    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        student.setId(studentId);
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return  ResponseEntity.ok(student);
    }

    //Spring Boot Rest Api that handle http Delete request - Delete Request
    @DeleteMapping("{id}/delete")

    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return  ResponseEntity.ok("student deleted Sucessfully");
    }
}
