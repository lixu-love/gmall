package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.FeightTemplateDao;
import com.atguigu.gmall.pms.entity.FeightTemplateEntity;
import com.atguigu.gmall.pms.service.FeightTemplateService;


@Service("feightTemplateService")
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateDao, FeightTemplateEntity> implements FeightTemplateService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FeightTemplateEntity> page = this.page(
                new Query<FeightTemplateEntity>().getPage(params),
                new QueryWrapper<FeightTemplateEntity>()
        );

        return new PageVo(page);
    }

}