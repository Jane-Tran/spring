package com.huytran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig2 {
	@Bean
	public Client clienta(Service serviceZ) {
		return new ClientA(serviceZ);
	}

	@Bean({ "x", "xx", "hihi", "haha" })
	public Service serviceX() {
		return new ServiceX();
	}
}
