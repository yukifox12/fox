package com.fox.day17.mapper;

import com.fox.day17.bean.Dep;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Mapper
public interface DepMapper {
  /*
   * 查询所有部门及部门下的员工
   * */
  //  @Select("select * from dep d left join grts.emp e on d.id = e.dep_id")
    //List<Dep> getAll();
}
