package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
  private final Integer id;
  private final String studentName;
}
