package codeLearn;

public class Fibonacci {
	int sumFibos(long n) {
		long f = (long)((Math.pow(1.0 + Math.sqrt(5.0), n + 2) - Math.pow((1.0) - Math.sqrt(5.0), n + 2))
				/ (Math.pow(2.0, n + 2) * Math.sqrt(5.0)) - 1);
		System.out.println(f%13);
		return (int) (f % 13);
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.sumFibos(5));
	}
}
