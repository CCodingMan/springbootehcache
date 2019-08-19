package com.ljj.springbootehcache.service.impl;

import com.ljj.springbootehcache.entity.Student;
import com.ljj.springbootehcache.mapper.StudentMapper;
import com.ljj.springbootehcache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author ljj
 * @since 2019-08-19 14:48:01
 */
@Service
@Transactional
@CacheConfig(cacheNames = "myCache")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Cacheable
    public List<Student> getStudentAll() {
        return studentMapper.getStudentAll();
    }

    @Override
    @Cacheable
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    @CachePut
    public int saveStudent(Student student) {
        return studentMapper.saveStudent(student);
    }

    @Override
    @CacheEvict
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    @CachePut
    public int updateStudent(Integer id) {
        Student student = studentMapper.getStudentById(id);
        return studentMapper.updateStudent(student);
    }
}