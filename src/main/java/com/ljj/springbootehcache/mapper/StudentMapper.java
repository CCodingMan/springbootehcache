package com.ljj.springbootehcache.mapper;

import com.ljj.springbootehcache.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: ljj
 * @Date: 2019/8/19 15:03
 * @Description:
 */
@Mapper
public interface StudentMapper {
    List<Student> getStudentAll();

    Student getStudentById(Integer id);

    int saveStudent(Student student);

    int deleteStudentById(Integer id);

    int updateStudent(Student student);
}
