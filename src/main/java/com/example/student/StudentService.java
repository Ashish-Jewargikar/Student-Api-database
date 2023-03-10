package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "student details added";
    }
     
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
    
    public Student getStudentById(int id){
        return studentRepository.findById(id).get();
    }
    
    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return " student with id " + id + " deleted ";
    }
    
    public String totalNoOfStudents(){
        int count = studentRepository.findAll().size();
        return "Total number of students are "+ count;
    }

    public List<Student> getStudentsByBranch(String branch) {
        return studentRepository.findByBranch(branch);
    }

    public List<Student> getStudentsByPercentageGreaterThan(int percentage) {
        return studentRepository.findByPercentageGreaterThan(percentage);
    }
   
}
