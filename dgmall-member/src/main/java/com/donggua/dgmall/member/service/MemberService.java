package com.donggua.dgmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donggua.common.utils.PageUtils;
import com.donggua.dgmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tianrundong
 * @email 1004028919@qq.com
 * @date 2020-04-04 14:02:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

