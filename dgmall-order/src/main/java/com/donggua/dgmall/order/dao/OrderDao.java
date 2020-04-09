package com.donggua.dgmall.order.dao;

import com.donggua.dgmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:13:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
