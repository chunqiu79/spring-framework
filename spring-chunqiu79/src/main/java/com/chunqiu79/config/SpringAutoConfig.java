package com.chunqiu79.config;

import org.springframework.context.annotation.Bean;

/**
 * @author: chunqiu79
 * @time: 2024/6/12 15:37
 * @desc:
 */
public class SpringAutoConfig {

	@Bean
	public String user() {
		return "chunqiu79";
	}

}
