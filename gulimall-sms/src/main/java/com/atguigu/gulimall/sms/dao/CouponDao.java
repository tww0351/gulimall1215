package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ljt
 * @email ljt@atguigu.com
 * @date 2019-12-16 11:18:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
