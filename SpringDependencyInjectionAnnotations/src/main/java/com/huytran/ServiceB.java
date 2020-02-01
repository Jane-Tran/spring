package com.huytran;

import org.springframework.stereotype.Component;

@Component("service1")
public class ServiceB implements Service {

	@Override
	public String getInfo() {
		return "ServiceB's Infomation";
	}

}
