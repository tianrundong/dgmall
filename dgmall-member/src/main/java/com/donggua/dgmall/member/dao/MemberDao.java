package com.donggua.dgmall.member.dao;

import com.donggua.dgmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:02:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
