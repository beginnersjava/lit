package com.github.lit.jdbc.statement.select;

import com.github.lit.jdbc.enums.Logic;
import com.github.lit.jdbc.statement.where.WhereExpression;

/**
 * User : liulu
 * Date : 2018/3/11 21:56
 * version $Id: SelectExpression.java, v 0.1 Exp $
 */
public class SelectExpression<T> extends WhereExpression<Select<T>> {

    protected SelectExpression(Select<T> select) {
        super(select);
    }

    public Select<T> equalsTo(Class<?> clazz, String property) {
        setExpression(Logic.EQ, clazz, property);
        return condition;
    }


    private void setExpression(Logic logic, Class<?> clazz, String property) {
        ((SelectImpl) condition).setExpression(logic, clazz, property);
    }

}
