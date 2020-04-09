package com.donggua.dgmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/4 14:05
 **/

@EnableFeignClients("com.donggua.dgmall.member.feign")
@MapperScan("com.donggua.dgmall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DgMallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgMallMemberApplication.class,args);
	}
}
