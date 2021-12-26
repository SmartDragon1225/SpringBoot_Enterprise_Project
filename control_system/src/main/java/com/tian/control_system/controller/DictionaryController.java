package com.tian.control_system.controller;

import com.tian.control_system.common.ResponseServer;
import com.tian.control_system.common.ResponserEnum;
import com.tian.control_system.pageEntity.PageEntity;
import com.tian.control_system.pojo.Dictionary;
import com.tian.control_system.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Package: com.tian.control_system.controller
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/18 17:26
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    DictionaryService dictionaryService;

    @PostMapping("/add")
    public ResponseServer add(Dictionary dictionary){
        Integer integer = dictionaryService.add(dictionary);
        if(integer == 0){
            return ResponseServer.error(500,"添加失败！");
        }
        return ResponseServer.success("添加成功！");
    }

    @GetMapping("/pagelist")
    public ResponseServer list(@RequestParam("page")Integer page,
                               @RequestParam("rows")Integer rows){
        if(page == null || rows == null){
            return ResponseServer.error(ResponserEnum.NOT_FIND);
        }
        return ResponseServer.success(dictionaryService.pageList(page, rows));
    }
}
