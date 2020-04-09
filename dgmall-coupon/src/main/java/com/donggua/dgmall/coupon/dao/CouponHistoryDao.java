package com.donggua.dgmall.coupon.dao;

import com.donggua.dgmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 12:37:02
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
