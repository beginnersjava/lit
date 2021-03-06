package com.github.lit.test.model;

import com.github.lit.jdbc.annotation.GeneratedValue;
import com.github.lit.jdbc.annotation.Id;
import com.github.lit.jdbc.annotation.Table;
import com.github.lit.jdbc.enums.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * User : liulu
 * Date : 2017-1-9 21:05
 * version $Id: Goods.java, v 0.1 Exp $
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = -7915472099544797458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goodsId; // 商品编码
    private String code; // 编码
    private String barCode; // 条形码
    private String specification; // 规格
    private String unit; // 单位
    private String category; // 分类
    private String categoryName; // 分类名称
    private String purchaserCode; // 采购员
    private String supplierCode; // 供应商
    private String name; // 品名
    private Double price; // 售价
    private Integer inventory; // 库存
    private Date gmtCreate; // 创建时间
}
