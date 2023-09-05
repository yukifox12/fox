package com.fox.day17.mapper;

import com.fox.day17.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    //@Select("select * from teacher_table where id = #{id}")
    Teacher getTeacher(Integer id);
}
