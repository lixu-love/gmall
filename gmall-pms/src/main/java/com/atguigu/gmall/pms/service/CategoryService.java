package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-06 09:46:39
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

