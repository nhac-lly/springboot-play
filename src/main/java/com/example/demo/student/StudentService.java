package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Nhac",
                        "nhac.ly@hotmail.com",
                        LocalDate.of(1993, Month.SEPTEMBER, 6),
                        28
                )
        );
    }
}
