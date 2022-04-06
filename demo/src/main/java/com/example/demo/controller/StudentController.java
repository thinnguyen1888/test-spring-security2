package com.example.demo.controller;

import com.example.demo.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
  private static final List<Student> LIST = Arrays.asList(
      new Student(1, "Lionel Messi"),
      new Student(2, "Cristiano Ronaldo"),
      new Student(3, "Fernando Torres"));

  @GetMapping(value = "{id}")
  public Student getStudent(@PathVariable("id") Integer id) {
    return LIST.stream().filter(student -> id.equals(student.getId())).findFirst()
        .orElseThrow(() -> new IllegalStateException("Student " + id + " does not exists"));
  }
}
