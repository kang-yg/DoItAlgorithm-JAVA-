package chap01;

class Solution08 {
	static void SumGauss(int a) {
		int sum = 0;

		if (a % 2 == 0) {
			sum = (1 + a) * (a / 2);
		} else {
			sum = (1 + a) * (a / 2) + Math.round(a / 2) + 1;
		}

		System.out.println(sum);
	}
}

public class Exercise08 {
	public static void main(String[] args) {
		Solution08.SumGauss(11);
	}
}
