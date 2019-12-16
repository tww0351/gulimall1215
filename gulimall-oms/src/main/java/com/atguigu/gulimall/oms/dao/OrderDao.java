package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ljt
 * @email ljt@atguigu.com
 * @date 2019-12-16 11:09:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
