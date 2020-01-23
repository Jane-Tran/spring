package factoryPattern;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFatory.getComputer("pc", "8 GB", "256 GB", "core i5");
		Computer server = ComputerFatory.getComputer("server", "2 GB", "500 GB", "core i9");
		System.out.println("Factory PC connfig: " + pc);
		System.out.println("Factory Server config: " + server);
	}

}
