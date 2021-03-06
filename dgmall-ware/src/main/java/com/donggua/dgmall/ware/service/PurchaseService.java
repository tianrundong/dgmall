package com.donggua.dgmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:25:08
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

