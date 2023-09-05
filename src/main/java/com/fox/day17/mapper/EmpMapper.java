package com.fox.day17.mapper;

import com.fox.day17.bean.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> getAll();
}
