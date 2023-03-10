package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.branch = :branch")
    List<Student> findByBranch(@Param("branch") String branch);

    @Query("SELECT s FROM Student s WHERE s.percentage >= :percentage")
    List<Student> findByPercentageGreaterThan(@Param("percentage") int percentage);
}

/* In Spring Boot, the JpaRepository is a generic interface provided by Spring Data JPA that provides basic CRUD (Create, Read, Update, Delete) operations for working with a database.

The StudentRepository interface is extending the JpaRepository interface and provides an abstraction layer for working with the Student entity in the database.

By extending JpaRepository, the StudentRepository interface automatically inherits all the methods from JpaRepository such as save(), findById(), findAll(), deleteById(), etc. These methods can be used to perform basic CRUD operations on the Student entity in the database.

The <> in the JpaRepository<Student, Integer> syntax is called a "diamond operator". It specifies the type arguments to the generic JpaRepository interface.

The first type argument Student represents the entity class that the repository manages, and the second type argument Integer represents the type of the primary key of the entity class. In other words, JpaRepository<Student, Integer> tells Spring that the StudentRepository interface is responsible for managing the Student entity in the database and that the primary key of the Student entity is of type Integer. */

