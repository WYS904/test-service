package com.example.testservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.testservice.entity.po.Student;
import com.example.testservice.mapper.StudentMapper;
import com.example.testservice.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 17102
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    /**
     * 查询方法
     */
    public List<Student> select() {
        List<Student> studentList = new ArrayList<>();
        Student student= studentMapper.selectOne(new QueryWrapper<Student>()
                .like("student_Number","1").or().like("name","张")
        );
        studentList.add(student);
        return studentList;
    }
    /**
     * 更新方法
     */
    @Override
    public Student update(Integer id) {
        Student student = new Student();
        student.setId(5);
        student.setStudentNumber(20);
        student.setGender("男");
        student.setName("老王");
        int result = studentMapper.updateById(student);
        return null;
    }
    /**
     * 删除方法
     */
    @Override
    public Student delete(Integer id) {
        int i = studentMapper.deleteById(5);
        return null;
    }
    /**
     * 插入方法
     */
    @Override
    public Student insert(Integer id) {
        Student student = new Student();
        student.setId(12);
        student.setAge(16);
        student.setStudentNumber(13);
        student.setGender("男");
        student.setName("小黄");
        int insert = studentMapper.insert(student);
        return null;
    }


}
