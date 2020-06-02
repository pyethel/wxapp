package com.lehteypzzz.wxapp.Entity.DO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="ORDER1")
public class OrderDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_ID")
    private Integer id;

    @Column(name="ORDER_PRICE")
    private Integer price;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name="CREATE_TIME")
    private LocalDateTime createTime;

    @Column(name="USER_ID")
    private String userId;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ORDER_STATE")
    private Integer state;
}
