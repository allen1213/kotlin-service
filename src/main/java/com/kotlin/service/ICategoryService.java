package com.kotlin.service;

import com.kotlin.bean.Category;
import com.kotlin.bean.example.CategoryExample;

import java.util.List;

public interface ICategoryService {

    int insertSelective(Category record);

    int deleteByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Category record);

    List<Category> selectByExample(CategoryExample example);
}
