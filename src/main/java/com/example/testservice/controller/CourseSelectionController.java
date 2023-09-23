package com.example.testservice.controller;

import com.example.testservice.entity.po.CourseSelection;
import com.example.testservice.service.CourseSelectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 17102
 */
@RestController
@RequestMapping("/courseSelect")
public class CourseSelectionController {
    @Resource
    private CourseSelectionService courseSelectionService;

    @GetMapping("/select")
    public List<CourseSelection> select(){
        List<CourseSelection> courseSelections = courseSelectionService.select();
        return courseSelections;
    }
}
