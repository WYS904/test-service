package com.example.testservice.service;

import com.example.testservice.entity.po.Student;

import java.util.List;

/**
 * @author 17102
 */
public interface StudentService {
    /**
     定义查询接口
     */
    List<Student> select();
    /**
     定义更新接口
     */
    Student update(Integer id);
    /**
     定义删除接口
     */
    Student delete(Integer id);
    /**
     定义插入接口
     */
    Student insert(Integer id);
}
