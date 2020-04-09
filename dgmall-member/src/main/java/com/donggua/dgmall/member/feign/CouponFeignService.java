package com.donggua.dgmall.member.feign;

import com.donggua.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/4 14:44
 **/

@FeignClient("dgmall-coupon")
public interface CouponFeignService {

	@RequestMapping("/coupon/coupon/member/list")
	public R membercoupons();
}
