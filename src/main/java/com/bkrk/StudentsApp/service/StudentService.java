package com.bkrk.StudentsApp.service;

import com.bkrk.StudentsApp.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
