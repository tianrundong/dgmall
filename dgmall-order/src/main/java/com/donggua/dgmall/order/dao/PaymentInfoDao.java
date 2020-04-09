package com.donggua.dgmall.order.dao;

import com.donggua.dgmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:13:07
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
