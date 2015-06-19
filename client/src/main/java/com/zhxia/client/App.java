package com.zhxia.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhxia.common.DemoService;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
    {
		String configLocation="spring/dubbo-consumer.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		DemoService demoService=(DemoService)context.getBean("demoService");
		int i=0;
		while(true){
			int result=demoService.sum(i,i*2);
			System.out.println("result:"+result);
			i++;
			Thread.sleep(500);
		}
    }
}
