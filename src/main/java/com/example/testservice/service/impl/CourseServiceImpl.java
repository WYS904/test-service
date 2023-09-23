package com.example.testservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.testservice.entity.po.Course;
import com.example.testservice.entity.po.Student;
import com.example.testservice.mapper.CourseMapper;
import com.example.testservice.service.CourseService;
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
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;
    /**
     * 查询课程接口
     */
    @Override
    public List<Course> select() {
        List<Course> courseList = new ArrayList<>();
        Course course = courseMapper.selectOne(new QueryWrapper<Course>()
                .like("name","英语"));
        courseList.add(course);
        return courseList;
    }
    /**
     * 更新课程接口
     */
    @Override
    public Course updateCourse(Integer id) {
        Course course = new Course();
        course.setId(2);
        course.setName("物理");
        course.setTeacher("老刘");
        int i = courseMapper.updateById(course);
        return null;
    }
    /**
     * 插入课程接口
     */
    @Override
    public List<Course> insert(Integer id) {
        List<Course> courses = new ArrayList<>();
        Course course = new Course();
        course.setId(5);
        course.setName("化学");
        course.setTeacher("老王");
        int insert = courseMapper.insert(course);
        System.out.println(insert);
        return null;
    }
    /**
     * 删除课程接口
     */
    @Override
    public List<Course> delete(Integer id) {
            int i = courseMapper.deleteById(1);
            return null;
    }
}
