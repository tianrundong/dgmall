package com.donggua.dgmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:13:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

