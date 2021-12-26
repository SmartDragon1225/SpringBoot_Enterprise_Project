/*
package com.tian.control_system.common.page;


import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.resultset.DefaultResultSetHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

*/
/***
 * mybatis对使用了分页方法的结果包装s
 *
 *//*

@Intercepts(@Signature(method = "handleResultSets", type = ResultSetHandler.class, args = {Statement.class}))
@Component
public class PageResultInterceptor implements Interceptor {

    private static Logger logger = LoggerFactory.getLogger(PageResultInterceptor.class);

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Object intercept(Invocation invocation) throws Throwable {
        // 获取代理目标对象
        Object target = invocation.getTarget();
        if (target instanceof DefaultResultSetHandler) {
            DefaultResultSetHandler resultSetHandler = (DefaultResultSetHandler) target;
            ParameterHandler parameterHandler = (ParameterHandler) ReflectUtil.getValueByFieldName(resultSetHandler, "parameterHandler");
            Object params = parameterHandler.getParameterObject();
            Page<?> page = MybatisPageUtil.getPageObject(params);
            Object obj = invocation.proceed();
            List<Page<?>> list = new ArrayList<>();
            if (obj instanceof List) {
                page.setRecords((List) obj);
            } else {
                // 返回不为List，为Null或者为单个的对象
                List records = new ArrayList();
                if (obj != null) {
                    records.add(obj);
                }
                page.setRecords(records);
            }
            list.add(page);
            return list;
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof DefaultResultSetHandler) {
            try {
                DefaultResultSetHandler resultSetHandler = (DefaultResultSetHandler) target;
                // 利用反射获取参数对象
                ParameterHandler parameterHandler = (ParameterHandler) ReflectUtil.getValueByFieldName(resultSetHandler, "parameterHandler");
                Object params = parameterHandler.getParameterObject();
                if (null != MybatisPageUtil.getPageObject(params)) {
                    return Plugin.wrap(target, this);
                }
            } catch (Exception e) {
                logger.error("分页查询结果处理失败", e);
            }
        }
        return target;
    }


    @Override
    public void setProperties(Properties properties) {
    }

}
*/
