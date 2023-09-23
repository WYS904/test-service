package com.example.testservice.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 17102
 * 选课实体类
 */
@Data
public class CourseSelection {
    private Integer id;
    private String courseName1;
    private String courseName2;
    private String courseName3;
    private String studentName;
}
