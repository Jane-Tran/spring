package com.huytran.DI;

public class ClientA implements Client {
	private Service service;

	public ClientA() {
		super();
	}

	public ClientA(Service service) {
		super();
		this.service = service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);

	}

}
