package com.zhxia.server;

import com.zhxia.common.DemoService;

public class DemoServiceImpl implements DemoService{

	public void sayHello() {
		System.out.println("hello world");
	}

	public String getMessage() {
		return "message sended from server!";
	}

	public int sum(int... it) {
		int sum=0;
		for(int i : it){
			sum+=i;
		}
		return sum;
	}
	
	
	
}
