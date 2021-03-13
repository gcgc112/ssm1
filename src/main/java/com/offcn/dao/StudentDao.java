package com.offcn.dao;

import com.offcn.pojo.Student;

import java.util.List;

public interface StudentDao {

    //查询全部
    List<Student> findAll();

    //添加操作
    void insert(Student student);

    void delete(String sno);


}
