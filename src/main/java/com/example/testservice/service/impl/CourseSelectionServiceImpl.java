package com.example.testservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.testservice.entity.po.Course;
import com.example.testservice.entity.po.CourseSelection;
import com.example.testservice.entity.po.Student;
import com.example.testservice.mapper.CourseSelectionMapper;
import com.example.testservice.service.CourseSelectionService;
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
public class CourseSelectionServiceImpl implements CourseSelectionService {

    @Resource
    private CourseSelectionMapper courseSelectionMapper;
    @Override
    public List<CourseSelection> select() {

        List<CourseSelection> courseSelections= courseSelectionMapper.selectList(
                new QueryWrapper<CourseSelection>()
                .like("studentname","张"));

        return courseSelections;
    }
}
