package com.ljj.springbootehcache.service;


import com.ljj.springbootehcache.entity.Student;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author ljj
 * @since 2019-08-19 14:48:00
 */
public interface StudentService {
    List<Student> getStudentAll();

    Student getStudentById(Integer id);

    int saveStudent(Student student);

    int deleteStudentById(Integer id);

    int updateStudent(Integer id);
}