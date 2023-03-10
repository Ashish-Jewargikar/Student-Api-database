package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
       return  studentService.addStudent(student);

    }
    
    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(@RequestParam int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteStudentById")
    public String deleteStudentById(@RequestParam int id){
        return studentService.deleteStudentById(id);
    }

    @GetMapping("/totalStudents")
    public String totalNoOfStudents(){
        return studentService.totalNoOfStudents();
    }
    
    @GetMapping("/getStudentsByBranch")
    public List<Student> getStudentsByBranch(@RequestParam String branch) {
        return studentService.getStudentsByBranch(branch);
    }

    @GetMapping("/getStudentsByPercentageGreaterThan")
    public List<Student> getStudentsByPercentageGreaterThan(@RequestParam int percentage) {
        return studentService.getStudentsByPercentageGreaterThan(percentage);
    }
   
}
