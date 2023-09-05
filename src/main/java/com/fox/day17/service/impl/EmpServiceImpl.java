package com.fox.day17.service.impl;

import com.fox.day17.bean.Emp;
import com.fox.day17.mapper.EmpMapper;
import com.fox.day17.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
   @Autowired
    EmpMapper empMapper;
    @Override
    public List<Emp> getAll() {
        List<Emp> empList = empMapper.getAll();
        return empList;
    }
}
