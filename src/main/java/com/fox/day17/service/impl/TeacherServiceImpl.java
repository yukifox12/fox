package com.fox.day17.service.impl;

import com.fox.day17.bean.Teacher;
import com.fox.day17.mapper.TeacherMapper;
import com.fox.day17.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public void addTeacher() {

    }

    @Override
    public Teacher getTeacher(Integer id) {
        Teacher teacher = teacherMapper.getTeacher(id);
        return teacher;
    }
}
