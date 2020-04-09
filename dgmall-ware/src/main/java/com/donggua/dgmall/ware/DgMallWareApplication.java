package com.donggua.dgmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/4 14:20
 **/

@MapperScan("com.donggua.dgmall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class DgMallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgMallWareApplication.class,args);
	}
}

