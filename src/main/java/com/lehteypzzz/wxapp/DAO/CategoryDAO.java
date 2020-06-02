package com.lehteypzzz.wxapp.DAO;

import com.lehteypzzz.wxapp.Entity.DO.CategoryDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CategoryDAO extends JpaRepository<CategoryDO, Integer>, JpaSpecificationExecutor<CategoryDO> {
    CategoryDO findCategoryDOById(Integer id);
}
