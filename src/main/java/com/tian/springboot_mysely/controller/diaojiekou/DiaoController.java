package com.tian.springboot_mysely.controller.diaojiekou;

import com.alibaba.fastjson.JSONObject;
import com.tian.springboot_mysely.common.HttpTrans;
import com.tian.springboot_mysely.common.ResponseServer;
import com.tian.springboot_mysely.common.ResponserEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.tian.springboot_mysely.controller.diaojiekou
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/9/7 8:50
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("/jiekou")
public class DiaoController {

    @RequestMapping("/list")
    public ResponseServer Diao(@RequestParam("name") String name){

        HttpTrans httpTrans = new HttpTrans();
        JSONObject trans = httpTrans.getTrans(name);
        if(trans != null){
            return ResponseServer.success(trans);
        }
        return ResponseServer.error(500,"调用错误！请检查路径是否正确！");
    }
}
