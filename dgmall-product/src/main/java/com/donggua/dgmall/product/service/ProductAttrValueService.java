package com.donggua.dgmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:22:37
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

