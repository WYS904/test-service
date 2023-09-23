package com.example.testservice.entity.po;

import lombok.Data;

/**
 * @author 17102
 * 课程实体类
 */
@Data
public class Course {
    /**
     * 课程id
     */
    private Integer id;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 课程老师
     */
    private String teacher;
}
