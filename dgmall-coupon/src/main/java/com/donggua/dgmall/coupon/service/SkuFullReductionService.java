package com.donggua.dgmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 12:37:02
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

