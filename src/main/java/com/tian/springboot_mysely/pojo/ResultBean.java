package com.tian.springboot_mysely.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.tian.springboot_mysely.pojo
 * Description： TODO
 * Author: 智龙
 * Date: Created in 2021/8/9 9:38
 * Company: China
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultBean {
    private String code;
    private String message;
    private Object data;
}
