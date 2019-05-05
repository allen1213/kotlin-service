package com.kotlin.service.impl;

import com.kotlin.bean.Category;
import com.kotlin.bean.example.CategoryExample;
import com.kotlin.dao.CategoryMapper;
import com.kotlin.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long categoryId) {
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(Category record) {
        return categoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Category> selectByExample(CategoryExample example) {
        return categoryMapper.selectByExample(example);
    }
}
