package com.example.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
