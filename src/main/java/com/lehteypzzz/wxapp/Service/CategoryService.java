package com.lehteypzzz.wxapp.Service;

import com.lehteypzzz.wxapp.DAO.CategoryDAO;
import com.lehteypzzz.wxapp.Entity.DO.CategoryDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    final
    CategoryDAO categoryDao;

    public CategoryService(CategoryDAO categoryDao) {
        this.categoryDao = categoryDao;
    }
    public List<CategoryDO> findAll(){
        return categoryDao.findAll();
    }

    public String findNameById(Integer id){
        CategoryDO result = categoryDao.findCategoryDOById(id);
        return result.getName();
    }

}
