package com.tian.springboot_mysely.pojo.pageEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Package: com.tian.springboot_mysely.pojo.pageEntity
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/9 16:36
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageEntity {

    private Long total;
    private List<? extends Object> pageList;

    public Long getTotal(){
        return total;
    }
    public void setTotal(Long total){
        this.total = total;
    }
    public List<? extends Object> getPageList(){
        return pageList;
    }
    public void setPageList(List<? extends Object> pageList) {
        this.pageList = pageList;
    }
}
