package com.github.lit.jdbc.statement.insert;

import com.github.lit.jdbc.statement.Statement;

/**
 * User : liulu
 * Date : 2017/6/4 16:38
 * version $Id: Insert.java, v 0.1 Exp $
 */
public interface Insert extends Statement {

    /**
     * insert 语句操作的字段和值
     *
     * @param property 字段名
     * @param value     字段值
     * @return Insert
     */
    Insert set(String property, Object value);

    <T, R> Insert set(PropertyFunction<T, R> property, Object value);

    /**
     * 不使用 ? 占位符拼接sql
     *
     * @return Insert
     */
    Insert natively();

    /**
     * @return 执行 insert 后的 id 值
     */
    Object execute();

}
