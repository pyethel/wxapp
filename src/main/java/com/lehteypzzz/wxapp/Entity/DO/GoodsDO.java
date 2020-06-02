package com.lehteypzzz.wxapp.Entity.DO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "goods")
public class GoodsDO {
     // 商品ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Integer id;
    // 图片路径
    @Column(name = "goods_image_src")
    private String imageSrc;
    // 商品名称
    @Column(name = "goods_name")
    private String name;
    // 商品价格
    @Column(name = "goods_price")
    private Integer price;
    // 超链接
    @Column(name = "goods_navigator_url")
    private String navigatorUrl;

    @Column(name = "goods_category_id")
    private Integer categoryId;
}
