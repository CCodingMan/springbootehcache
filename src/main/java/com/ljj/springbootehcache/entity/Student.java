package com.ljj.springbootehcache.entity;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * (Student)表实体类
 *
 * @author ljj
 * @since 2019-08-19 14:45:08
 */
@Data
@Builder(toBuilder = true)
public class Student implements Serializable {
    private static final long serialVersionUID = 8607518040903696219L;
    //学生编号
    private Integer id;
    //学生名称
    private String name;
    //学生年龄
    private Integer age;

}