package com.donggua.dgmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:13:07
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

