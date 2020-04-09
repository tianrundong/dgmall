package com.donggua.dgmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:22:37
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

