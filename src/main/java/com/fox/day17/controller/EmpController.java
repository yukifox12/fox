package com.fox.day17.controller;

import com.fox.day17.bean.Emp;
import com.fox.day17.service.EmpService;
import com.fox.day17.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;
    @GetMapping("/getAll")
   public Result getAll(){
       List<Emp> empList = empService.getAll();
       return Result.success(empList);
   };
}
