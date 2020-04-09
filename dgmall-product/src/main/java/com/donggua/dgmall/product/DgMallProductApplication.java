package com.donggua.dgmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/4 14:18
 **/

@MapperScan("com.donggua.dgmall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DgMallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgMallProductApplication.class,args);
	}
}
