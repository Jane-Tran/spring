package codeLearn;

public class DistributeCandy {
	int distributeCandy(int[] man, int b, int k, int n) {
		int sk = 0, sb = 0;
		for (int i = 0; i < man.length; i++) {
			if (man[i] > 15) {
				man[i] = 2;
			} else {
				man[i] = 4;
			}
			System.out.println(man[i]+"**");
		}
		for (int i = 0; i < man.length - 1; i++) {
			if (man[i] >= 4 && man[i + 1] == 4) {
				man[i] = man[i + 1] = 8;
				
			}
			if (man[i] <= 2 && man[i + 1] == 2) {
				man[i] = 1;
				man[i + 1] = 1;
				i++;
			}
			System.out.println(man[i]+"--");

		}
		for (int i = 0; i < man.length; i++) {
			if (man[i] > 3)
				sk += man[i];
			else
				sb += man[i];
			System.out.println(man[i]);
		}
		return (sk * k + sb * b) > n ? (sk * k + sb * b) - n : 0;
	}

	public static void main(String[] args) {
		DistributeCandy dc = new DistributeCandy();
		int[] man = {1,13,24,35,1,2,3,23,12,24,34,33 };
		System.out.println(dc.distributeCandy(man, 5, 5, 200));

	}

}
