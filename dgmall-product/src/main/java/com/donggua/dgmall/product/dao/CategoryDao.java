package com.donggua.dgmall.product.dao;

import com.donggua.dgmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:22:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
