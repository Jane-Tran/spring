package dependency;

public class ClientA2 {
	private Service service;

	public ClientA2(Service service) {
		this.service = service;
	}

	public void doSomething() {

		String info = service.getInfo();
		System.out.println(info);
	}

	public static void main(String[] args) {
		ServiceD service = new ServiceD();
		ClientA2 client = new ClientA2( service);
		client.doSomething();
	}

}
