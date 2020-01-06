package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.FeightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-05 11:00:23
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

