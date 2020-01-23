package codeLearn;
import java.util.Scanner;

/**
 * @author HuyTran
 *
 */
public class HelloWorld {
	public static float f = 5.5f;

	public static void main(String[] args) {
		if (f > 0.0f) {

		}
		System.out.println("Hello World !");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt(); // get year from user input

		System.out.println(year + " is " + (year % 4 == 0 ? "a leap year" : "not a leap year"));
		scanner.close();
	}
}
