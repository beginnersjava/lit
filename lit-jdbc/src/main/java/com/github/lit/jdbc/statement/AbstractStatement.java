package com.github.lit.jdbc.statement;

import com.github.lit.commons.util.Assert;
import com.github.lit.jdbc.StatementExecutor;
import com.github.lit.jdbc.model.TableInfo;
import com.github.lit.jdbc.page.StatementPageHandler;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.sf.jsqlparser.schema.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * User : liulu
 * Date : 2017/6/4 9:31
 * version $Id: AbstractStatement.java, v 0.1 Exp $
 */
@NoArgsConstructor
public abstract class AbstractStatement implements Statement {

    protected static final String JDBC_PARAM = "?";

    protected Table table;

    protected TableInfo tableInfo;

    protected List<Object> params;

    @Setter
    protected StatementExecutor executor;

    @Setter
    protected StatementPageHandler pageHandler;

    @Setter
    protected String dbName;


    protected AbstractStatement(Class<?> clazz) {
        params = new ArrayList<>();
        tableInfo = new TableInfo(clazz);
        table = new Table(tableInfo.getTableName());
    }


    protected String getColumnName(String fieldName) {
        Assert.notEmpty(fieldName, "fieldName must not be empty!");
        String column = tableInfo.getFieldColumnMap().get(fieldName);
        return column == null || column.isEmpty() ? fieldName : column;
    }



}