package com.example.demo.controller;

import com.example.demo.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class ManagementController {
  private static final List<Student> LIST = Arrays.asList(
      new Student(1, "Lionel Messi"),
      new Student(2, "Cristiano Ronaldo"),
      new Student(3, "Fernando Torres"));

  @GetMapping
  public List<Student> getList() {
    return LIST;
  }

  @PostMapping
  public void post(@RequestBody Student student) {
    System.out.println(student);
  }

  @PutMapping(value = "{id}")
  public void put(@PathVariable("id") Integer id) {
    System.out.println(id);
  }

  @DeleteMapping(value = "{id}")
  public void delete(@RequestBody Student student, @PathVariable("id") Integer id) {
    System.out.println(String.format("%, %", student, id));
  }
}
