package codeLearn;
import java.text.DecimalFormat;

public class SetOEequations {
	String setOEequations(int[] numbers) {
		int d = numbers[0] * numbers[4] - numbers[1] * numbers[3];
		int dx = numbers[2] * numbers[4] - numbers[5] * numbers[1];
		int dy = numbers[0] * numbers[5] - numbers[3] * numbers[2];
		if (d == 0) {
			if (dx + dy == 0)
				return "Infinities";
			else if (dx != 0 || dy != 0)
				return "Can't not solve";
		}
		String x = "", y = "";
		DecimalFormat df = new DecimalFormat("#.#");
		if (dx % d != 0) {
			x = String.valueOf(df.format((double) dx / d));
		} else
			x = String.valueOf(Math.round(dx / d));
		if (dy % d != 0)
			y = String.valueOf(df.format((double) dy / d));
		else
			y = String.valueOf(Math.round(dy / d));

		return x + "," + y;
	}

	public static void main(String[] args) {
		SetOEequations se = new SetOEequations();
		int[] numbers = { 1, 8, 3, 1, 2, 8 };
		System.out.println(se.setOEequations(numbers));
	}
}
