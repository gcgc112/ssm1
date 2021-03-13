package com.offcn.service;

import com.offcn.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> queryAll();

    void save(Student student);

    void delete(String sno);

}
