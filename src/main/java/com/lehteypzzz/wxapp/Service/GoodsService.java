package com.lehteypzzz.wxapp.Service;

import com.lehteypzzz.wxapp.DAO.GoodsDAO;
import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    final
    GoodsDAO goodsDao;

    public GoodsService(GoodsDAO goodsDao) {
        this.goodsDao = goodsDao;
    }
    public List<GoodsDO> findThree(){
        List<GoodsDO> result = new ArrayList<>();
        result.add(goodsDao.getOne(1));
        result.add(goodsDao.getOne(2));
        result.add(goodsDao.getOne(3));
        return result;
    }
    public List<GoodsDO> findByCategoryId(Integer id)
    {
        return goodsDao.findAllByCategoryId(id);
    }
    public List<GoodsDO> findAll(){
        return goodsDao.findAll();
    }
    public GoodsDO findOneById(Integer id){
        return goodsDao.getOne(id);
    }
    public List<GoodsDO> queryByName(String name){
        return goodsDao.findByName(name);
    }
}
