package com.tian.control_system.common.page;


import java.util.Map;

/**
 * @author Wenqiang Yang
 * @date 2018/01/11
 */
public class MybatisPageUtil {
    private MybatisPageUtil(){

    }
    /**
     * 获取Page对象
     * @param params
     * @return 如果存在就返回Page对象，不存在就返回null
     */
    public static Page<?> getPageObject(Object params) {
        if (params instanceof Page<?>) {
            return (Page<?>) params;
        }
        if(params instanceof Map<?,?>) {
            Map<?,?> map = (Map<?, ?>) params;
            for (Map.Entry<?,?> entry : map.entrySet()) {
                if (entry.getValue() instanceof Page<?>) {
                    return (Page<?>) entry.getValue();
                }
            }
        }
        return null;
    }
}
