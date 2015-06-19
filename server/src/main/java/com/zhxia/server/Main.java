package com.zhxia.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String configLocation="spring/dubbo-provider.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		String[] names=context.getBeanDefinitionNames();
		if(names.length>0){
			for(String name:names){
				System.out.println(name);
			}
		}
		Thread.sleep(Long.MAX_VALUE);
	}

}
