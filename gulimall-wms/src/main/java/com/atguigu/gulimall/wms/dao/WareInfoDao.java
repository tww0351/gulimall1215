package com.atguigu.gulimall.wms.dao;

import com.atguigu.gulimall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author ljt
 * @email ljt@atguigu.com
 * @date 2019-12-16 11:22:51
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
