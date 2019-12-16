package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.SpuCommentEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author ljt
 * @email ljt@atguigu.com
 * @date 2019-12-16 11:13:20
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

