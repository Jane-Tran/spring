package com.huytran;

@org.springframework.stereotype.Service("service")
public class ServiceC implements Service {

	@Override
	public String getInfo() {
		return "ServiceC's Infomation 11111";
	}

}
