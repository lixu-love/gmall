package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-06 09:46:40
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

