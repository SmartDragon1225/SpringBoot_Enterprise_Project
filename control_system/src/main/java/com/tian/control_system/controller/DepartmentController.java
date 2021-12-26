package com.tian.control_system.controller;

import com.tian.control_system.common.ResponseServer;
import com.tian.control_system.common.ResponserEnum;
import com.tian.control_system.common.page.Page;
import com.tian.control_system.pojo.Department;
import com.tian.control_system.service.DepartmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Package: com.tian.control_system.controller
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/18 11:09
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    //分页查询接口
    //分页查询
    @GetMapping("/pagelist")
    public ResponseServer pagelist(@RequestParam("page") Integer page,
                                   @RequestParam("rows") Integer rows) {
        if(page == null || rows == null){
            return ResponseServer.error(ResponserEnum.NOT_FIND);
        }
        return ResponseServer.success(departmentService.pageList(page,rows));
    }

    //添加
    @PostMapping("/add")
    public ResponseServer add(Department department){
        Integer integer = departmentService.add(department);
        if(integer == 0){
            return ResponseServer.error(500,"添加失败！");
        }
        return ResponseServer.success("添加成功！");
    }

    @GetMapping("/list")
    public ResponseServer list(Page page, Department department){
        departmentService.findDepartmentByPage(page,department);
        return ResponseServer.success();
    }

    @GetMapping("/select")
    public ResponseServer list(@RequestParam("name") String name,
                               @RequestParam("status") Integer status){
        List<Department> select = departmentService.select(name,status);
        if(select == null){
            return ResponseServer.error(500,"查询失败！");
        }
        return ResponseServer.success(select);
    }
}
