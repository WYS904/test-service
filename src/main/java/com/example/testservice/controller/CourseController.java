package com.example.testservice.controller;

import com.example.testservice.entity.po.Course;
import com.example.testservice.mapper.CourseMapper;
import com.example.testservice.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 17102
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;
    /**
     * 查询课程方法
     */
    @GetMapping("/select")
    public List<Course> select(){
        List<Course> select = courseService.select();
        return select;
    }
    /**
     * 更新课程方法
     */
    @GetMapping("/update")
    public Course update(Integer id){
        Course course = courseService.updateCourse(id);
        return course;
    }
    /**
     * 插入课程方法
     */
    @GetMapping("/insert")
    public List<Course> insert(Integer id){
        List<Course> insert = courseService.insert(id);
        return insert;
    }
    /**
     * 删除课程方法
     */
    @GetMapping("/delete")
    public List<Course> delete(Integer id){
        List<Course> delete = courseService.delete(id);
        return delete;
    }
}
