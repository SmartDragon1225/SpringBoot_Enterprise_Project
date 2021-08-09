package com.tian.springboot_mysely.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.tian.springboot_mysely.utils
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/9 16:50
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
    private long pageIndex = 1;//当前页
    private long pageSize = 5;//每页条数
    private long totalCount;//总条数
    private long pageCount;//总页数
    private long startPos;//开始下标
    private long endPos;//结束下标

    //计算分页信息
    private void calculatePage(){
        if((totalCount & pageSize) == 0){
            pageCount = totalCount / pageSize;
        }else {
            pageCount = totalCount / pageSize + 1;
        }
        startPos = (pageIndex - 1) * pageSize;
        endPos = pageIndex + pageSize;
    }
}
