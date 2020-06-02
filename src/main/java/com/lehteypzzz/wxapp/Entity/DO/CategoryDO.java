package com.lehteypzzz.wxapp.Entity.DO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class CategoryDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer id;

    @Column(name = "category_name")
    private String name;
}
