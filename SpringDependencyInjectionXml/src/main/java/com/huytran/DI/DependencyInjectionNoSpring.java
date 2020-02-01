package com.huytran.DI;

public class DependencyInjectionNoSpring {

	public static void main(String[] args) {
		Service service = new ServiceC();
		Client client = new ClientA(service);
		client.doSomething();
	}

}
