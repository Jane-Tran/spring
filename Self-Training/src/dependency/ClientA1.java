package dependency;

public class ClientA1 {
	//hard dependency
	private ServiceC service;

	public void doSomething() {
		service = new ServiceC();
		String info = service.getInfo();
		System.out.println(info);
	}

	public static void main(String[] args) {
		ClientA1 client = new ClientA1();
		client.doSomething();
	}
}

class ServiceB {
	public String getInfo() {
		return "ServiceB's info";
	}
}
