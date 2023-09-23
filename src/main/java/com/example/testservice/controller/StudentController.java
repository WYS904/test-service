package com.example.testservice.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.testservice.entity.po.Student;
import com.example.testservice.mapper.StudentMapper;
import com.example.testservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 17102
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 学生查询接口
     */
    @GetMapping("/select")
    public List<Student> Select() {
        List<Student> list = studentService.select();
        return list;
    }

    /**
     * 学生更新接口
     */
    @GetMapping("/update")
    public Student Update(Integer id) {
        Student update = studentService.update(5);
        return update;
    }

    /**
     * 学生更新接口
     */
    @GetMapping("/delete")
    public Student Delete(Integer id) {
        Student delete = studentService.delete(5);
        return delete;
    }

    /**
     * 学生插入接口
     */
    @GetMapping("/insert")
    public Student Insert(Integer id) {
        Student insert = studentService.insert(5);
        return insert;
    }

}
