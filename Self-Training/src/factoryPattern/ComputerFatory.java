package factoryPattern;

public class ComputerFatory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase("Server"))
			return new Server(ram, hdd, cpu);
		return null;
	}
}
