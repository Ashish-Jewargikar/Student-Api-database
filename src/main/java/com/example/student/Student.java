package com.example.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
    
    @Id
    @Column(name="id")
    int id;
    String name;
    int rollno;
    String branch;
    String sem;
    int percentage;

   
    public Student() {
    }

    public Student(int id,String name, int rollno, String branch, String sem,int percentage) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.sem = sem;
        this.percentage=percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

  

}
