package com.offcn.controller;

import com.offcn.converter.DateConverter;
import com.offcn.pojo.Student;
import com.offcn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("student")
public class GoodsController {


    @Autowired
    private StudentService studentService;


    @RequestMapping("findAll")
    public String findAll(Model model) {
        
        System.out.println("请求过来了！");
        List<Student> list = studentService.queryAll();
        model.addAttribute("list",list);
        return "studentList";
    }

    //去添加页面
    @RequestMapping("tosave")
    public String toSave() {
        return "studentsave";
    }

    @RequestMapping("save")
    public String save(Student student) {
        studentService.save(student);
        return "redirect:/student/findAll.do";
    }

    @RequestMapping("delete")
    public String delete(String sno) {
        studentService.delete(sno);
        return "redirect:/student/findAll.do";
    }

    @RequestMapping("update")
    public String update() {
        return "";
    }

    @RequestMapping("updateById")
    public String updateById() {
        return "aaa";
    }

}
