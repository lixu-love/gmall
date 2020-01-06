package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.WareOrderTaskEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-05 11:00:23
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

