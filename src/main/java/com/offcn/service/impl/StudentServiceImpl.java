package com.offcn.service.impl;

import com.offcn.converter.DateConverter;
import com.offcn.dao.StudentDao;
import com.offcn.pojo.Student;
import com.offcn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private DateConverter dateConverter;

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> queryAll() {
        return studentDao.findAll();
    }

    @Override
    public void save(Student student) {
        Date sbirthday = student.getSbirthday();
        Date convert = dateConverter.convert(sbirthday.toString());
        student.setSbirthday(convert);
        studentDao.insert(student);
    }

    @Override
    public void delete(String sno) {
        studentDao.delete(sno);
    }
}
