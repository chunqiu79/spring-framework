package com.chunqiu79;

import com.chunqiu79.config.SpringAutoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: chunqiu79
 * @time: 2024/6/12 15:22
 * @desc:
 */
public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAutoConfig.class);
		String bean = applicationContext.getBean(String.class);
		System.out.println("===========================================");
		System.out.println("bean:" + bean);
	}

}
