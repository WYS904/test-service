package com.example.testservice.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.testservice.entity.po.Course;

import java.util.List;

/**
 * @author 17102
 */
public interface CourseService {
    /**
     * 定义课程查询接口
     */
    List<Course> select();
    /**
     * 定义课程更新接口
     */
    Course updateCourse(Integer id);
    /**
     * 定义课程插入接口
     */
    List<Course> insert(Integer id);
    /**
     * 定义课程删除接口
     */
    List<Course> delete(Integer id);
}
