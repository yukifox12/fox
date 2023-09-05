package com.fox.day17.controller;

import com.fox.day17.bean.Teacher;
import com.fox.day17.service.TeacherService;
import com.fox.day17.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin //设置跨域
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/a")
    public void show(){
        System.out.println("Hello");
    }
    @GetMapping("/get/{id}")
    public Result getTeacher(@PathVariable Integer id){
        Teacher teacher = teacherService.getTeacher(id);
        return Result.success(teacher);
    }
}
