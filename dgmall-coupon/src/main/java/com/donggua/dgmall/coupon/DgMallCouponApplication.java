package com.donggua.dgmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/4 12:51
 **/

@MapperScan("com.donggua.dgmall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DgMallCouponApplication {
	public static void main(String[] args) {
		SpringApplication.run(DgMallCouponApplication.class,args);
	}
}
