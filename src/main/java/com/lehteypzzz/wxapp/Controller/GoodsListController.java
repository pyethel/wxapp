package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import com.lehteypzzz.wxapp.Entity.VO.GoodsListVO;
import com.lehteypzzz.wxapp.Service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("goods_list")
public class GoodsListController {
    final
    GoodsService goodsService;

    public GoodsListController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @RequestMapping("getGoodsList")
    @ResponseBody
    public GoodsListVO getGoodsList(Integer pageNum, Integer pageSize){
        List<GoodsDO> total = goodsService.findAll();
        GoodsListVO goodsListVO = new GoodsListVO();
        goodsListVO.setPageNum(pageNum);
        goodsListVO.setTotal(total.size());
        List<GoodsDO> goods = new ArrayList<>();
        for(int i=((pageNum-1)*pageSize);i<(pageNum*pageSize)&&i<(total.size());i++)
        {
            goods.add(total.get(i));
        }
        goodsListVO.setGoods(goods);
        return goodsListVO;
    }
}
