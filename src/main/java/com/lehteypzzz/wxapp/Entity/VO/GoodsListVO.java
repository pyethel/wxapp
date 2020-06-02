package com.lehteypzzz.wxapp.Entity.VO;

import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import lombok.Data;

import java.util.List;

@Data
public class GoodsListVO {
    private Integer total;
    private Integer pageNum;
    private List<GoodsDO> goods;
}
