package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lixu
 * @email lixu@atguigu.com
 * @date 2020-01-05 11:00:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
