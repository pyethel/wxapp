package com.lehteypzzz.wxapp.DAO;

import com.lehteypzzz.wxapp.Entity.DO.GoodsDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface GoodsDAO extends JpaRepository<GoodsDO, Integer>, JpaSpecificationExecutor<GoodsDO> {
    List<GoodsDO> findAllByCategoryId(Integer categoryId);

    @Query(value = "select * from goods g where g.goods_name " +
            "like CONCAT('%',:name,'%')", nativeQuery = true)
    List<GoodsDO> findByName(String name);
}
