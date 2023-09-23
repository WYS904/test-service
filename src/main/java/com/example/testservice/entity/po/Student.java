package com.example.testservice.entity.po;

import lombok.Data;

/**
 * @author 17102
 * 学生实体类
 */
@Data
public class Student {
    /**
     学生id
     */
    private Integer id;
    /**
     学生学号
     */
    private Integer studentNumber;
    /**
     学生姓名
     */
    private String name;
    /**
     学生年龄
     */
    private Integer age;
    /**
     学生性别
     */
    private String gender;
}
