package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-06 09:46:39
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

