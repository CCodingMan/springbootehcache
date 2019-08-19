package com.ljj.springbootehcache.controller;


import com.ljj.springbootehcache.entity.Student;
import com.ljj.springbootehcache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Student)表控制层
 *
 * @author ljj
 * @since 2019-08-19 14:48:02
 */
@RequestMapping("student/")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "save")
    public int save(){
        Student student = Student.builder().name("红九").age(20).build();
        return studentService.saveStudent(student);
    }

    @GetMapping(value = "delete/{id}")
    public int delete(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }

    @GetMapping(value = "update/{id}")
    public int update(@PathVariable Integer id){
        return studentService.updateStudent(id);
    }

    @GetMapping("getStudentById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @GetMapping("getStudentAll")
    public List<Student> getStudentAll(){
        return studentService.getStudentAll();
    }
}