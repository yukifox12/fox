package com.fox.day17.controller;

import com.fox.day17.bean.Dep;
import com.fox.day17.service.DepService;
import com.fox.day17.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DepController {
 /*   @Autowired
    private DepService depService ;*/
    /*
    * 查询所有部门及部门下的员工
    * */
 /*   @GetMapping("/getAll")
    public Result getAll(){
        List<Dep> deps = depService.getAll();
        return Result.success(deps);
    }*/
}
