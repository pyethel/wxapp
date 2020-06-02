package com.lehteypzzz.wxapp.Entity.VO;

import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import lombok.Data;

import java.util.List;

@Data
public class IndexFloorVO {
    private Integer id;
    private String name;
    private List<GoodsDO> list;
}
