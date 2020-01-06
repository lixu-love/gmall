package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoDescEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-06 09:46:39
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

