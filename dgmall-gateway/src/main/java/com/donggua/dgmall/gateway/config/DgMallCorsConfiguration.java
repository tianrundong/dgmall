package com.donggua.dgmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/4/8 23:27
 **/
@Configuration
public class DgMallCorsConfiguration {

	@Bean
	public CorsWebFilter corsWebFilter(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		CorsConfiguration corsConfiguration = new CorsConfiguration();

		//1、配置跨域
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.setAllowCredentials(true);

		source.registerCorsConfiguration("/**",corsConfiguration);
		return new CorsWebFilter(source);
	}
}
