package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Utils.DozerMapperConstant;
import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import com.lehteypzzz.wxapp.Entity.VO.GoodsDetailVO;
import com.lehteypzzz.wxapp.Service.GoodsService;
import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("search")
public class SearchController {
    final GoodsService goodsService;

    public SearchController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @RequestMapping("query")
    @ResponseBody
    public List<GoodsDetailVO> Query(String query){
        List<GoodsDO> goods = goodsService.queryByName(query);
        List<GoodsDetailVO> result = new ArrayList<>();
        for(GoodsDO g:goods){
            Mapper mapper = DozerMapperConstant.dozerMapper;
            result.add(mapper.map(g, GoodsDetailVO.class));
        }
        return result;
    }
}
