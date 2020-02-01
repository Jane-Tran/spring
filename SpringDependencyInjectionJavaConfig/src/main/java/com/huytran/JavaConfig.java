package com.huytran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean("client1")
	public Client getClient(Service service1) {
		return new ClientA(service1);
	}

	@Bean("service1")
	public Service getService() {
		return new ServiceY();
	}

	@Bean // dat ten hoac dung chinh ten phuong thuc de goi
	public Service serviceZ() {
		return new ServiceZ();
	}

}
