/*
package com.tian.control_system.common.page;


import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

*/
/**
 * mybatis 分页拦截器
 * @author Wenqiang Yang
 * @date 2018/01/11
 *//*

@Intercepts(@Signature(type = StatementHandler.class,method = "prepare", args = {Connection.class,Integer.class}))
@Component
public class PageInterceptor implements Interceptor {

    private static Logger logger = LoggerFactory.getLogger(PageInterceptor.class);

    private static String PAGE_SQL_ID = "find";
    private static String COUNT_SQL_ID = "count";
    */
/**
     * 对需要分页的方法进行处理
     * @param invocation
     * @return
     * @throws Throwable
     *//*

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        if (target instanceof RoutingStatementHandler) {
            RoutingStatementHandler routingStatementHandler = (RoutingStatementHandler) target;
            StatementHandler delegate = (StatementHandler) ReflectUtil.getValueByFieldName(routingStatementHandler,"delegate");
            BoundSql boundSql = delegate.getBoundSql();
            Object params = boundSql.getParameterObject();
            Page<?> page = MybatisPageUtil.getPageObject(params);
            if (null != page) {
                MappedStatement mappedStatement = (MappedStatement) ReflectUtil.getValueByFieldName(delegate,"mappedStatement");
                //拦截到的prepare方法参数是一个Connection对象
                Connection connection = (Connection) invocation.getArgs()[0];
                //给当前的page参数对象设置总记录数
                setTotalRecords(params,page,connection,mappedStatement);
                StringBuffer stringBuffer = new StringBuffer(boundSql.getSql());
                //获取分页Sql语句
                String pageSql = getPageSql(page,stringBuffer);
                //利用反射设置当前BoundSql对应的sql属性为我们建立好的分页Sql语句
                ReflectUtil.setValueByFieldName(boundSql,"sql",pageSql);
            }
        }
        return invocation.proceed();
    }

    private String getPageSql(Page<?> page, StringBuffer stringBuffer) {
        stringBuffer.append(" limit ").append(page.getFirstNum()).append(",").append(page.getPageSize());
        return stringBuffer.toString();
    }

    */
/**
     * 设置总条数
     * @param params
     * @param page
     * @param connection
     * @param mappedStatement
     *//*

    private void setTotalRecords(Object params, Page<?> page, Connection connection, MappedStatement mappedStatement) {
       // 全路径的分页方法，例如 com.tuotuo.source.mapper.ImagesMapper.findPage
        String pageMapperId = mappedStatement.getId();
        // 转成数组
        String[] temps = pageMapperId.split("\\.");
        // 替换find为count
        String countSqlId = temps[temps.length - 1].replace(PAGE_SQL_ID,COUNT_SQL_ID);
        // 转换成全路径
        String countMapperId = pageMapperId.replace(temps[temps.length - 1],countSqlId);
        MappedStatement countMappedStatement = mappedStatement.getConfiguration().getMappedStatement(countMapperId);
        // 获取统计的BoundSql
        BoundSql countBoundSql = countMappedStatement.getBoundSql(params);
        try {
            PreparedStatement countPreparedStatement = connection.prepareStatement(countBoundSql.getSql());
            DefaultParameterHandler defaultParameterHandler = new DefaultParameterHandler(countMappedStatement,params,countBoundSql);
            // 给sql中占位符设置值
            defaultParameterHandler.setParameters(countPreparedStatement);
            ResultSet rs = countPreparedStatement.executeQuery();
            if (rs.next()) {
                Long count = rs.getLong(1);
                if (count > 0) {
                    page.setTotalNum(count);
                }else{
                    page.setTotalNum(0L);
                }
            }
        } catch (SQLException e) {
            logger.error("分页拦截器设置总页数失败",e);
        }
    }

    */
/**
     * 什么时候使用拦截器
     * @param target
     * @return
     *//*

    @Override
    public Object plugin(Object target) {
        if (target instanceof RoutingStatementHandler) {
            RoutingStatementHandler routingStatementHandler = (RoutingStatementHandler) target;
            StatementHandler delegate = null;
            try {
                delegate = (StatementHandler) ReflectUtil.getValueByFieldName(routingStatementHandler,"delegate");
                BoundSql boundSql = delegate.getBoundSql();
                Object params = boundSql.getParameterObject();
                // 分析参数列表中是否有Page对象，如果有就是用拦截器，没有就不做改动
                if (null != MybatisPageUtil.getPageObject(params)) {
                    return Plugin.wrap(target,this);
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                logger.error("分页拦截器执行错误",e);
            }
        }
        return target;
    }



    @Override
    public void setProperties(Properties properties) {

    }
}
*/
