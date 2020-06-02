package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Utils.DozerMapperConstant;
import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import com.lehteypzzz.wxapp.Entity.VO.IndexFloorVO;
import com.lehteypzzz.wxapp.Entity.VO.IndexGoodsVO;
import com.lehteypzzz.wxapp.Service.CategoryService;
import com.lehteypzzz.wxapp.Service.GoodsService;
import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("index")
public class IndexController {
    final
    GoodsService goodsService;
    final
    CategoryService categoryService;

    public IndexController(GoodsService goodsService,
                           CategoryService categoryService) {
        this.goodsService = goodsService;
        this.categoryService = categoryService;
    }

    @RequestMapping("/swiper")
    @ResponseBody
    public List<IndexGoodsVO> IndexSwiper() {
        //类映射工具 对象转换
        Mapper mapper = DozerMapperConstant.dozerMapper;
        List<GoodsDO> goodsDoList = goodsService.findThree();
        List<IndexGoodsVO> result = new ArrayList<>();
        for(GoodsDO g: goodsDoList){
            //DO转VO
            IndexGoodsVO goodsVo = mapper.map(g, IndexGoodsVO.class);
            result.add(goodsVo);
        }
        return result;
    }

    @RequestMapping("/floor")
    @ResponseBody
    public List<IndexFloorVO>IndexFloor(){
        List<IndexFloorVO> result = new ArrayList<>();
        for(int i =2; i<=3; i++) {
            List<GoodsDO> goodsList = goodsService.findByCategoryId(i);
            String categoryName = categoryService.findNameById(i);
            IndexFloorVO result1 = new IndexFloorVO();
            result1.setId(i);
            result1.setName(categoryName);
            result1.setList(goodsList);
            result.add(result1);
        }
        return result;
    }
}
