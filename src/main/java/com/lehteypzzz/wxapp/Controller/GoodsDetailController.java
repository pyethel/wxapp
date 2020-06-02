package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Utils.DozerMapperConstant;
import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import com.lehteypzzz.wxapp.Entity.VO.GoodsDetailVO;
import com.lehteypzzz.wxapp.Service.GoodsService;
import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("goods_detail")
public class GoodsDetailController {
    final
    GoodsService goodsService;

    public GoodsDetailController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @RequestMapping("getGoodsDetail")
    @ResponseBody
    public GoodsDetailVO getGoodsDetail(Integer goodsId){
        GoodsDO DO = goodsService.findOneById(goodsId);
        Mapper mapper = DozerMapperConstant.dozerMapper;
        return mapper.map(DO, GoodsDetailVO.class);
    }
}
