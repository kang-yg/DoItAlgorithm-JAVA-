package chap01;

class Solution01 {
	static int max4(int a, int b, int c, int d) {
		int result = a;
		if (result < b) {
			result = b;
		}
		if (result < c) {
			result = c;
		}
		if (result < d) {
			result = d;
		}

		return result;
	}
}

public class Exercise01 {
	public static void main(String[] args) {
		System.out.println("max4(4, 3, 2, 1) = " + Solution01.max4(4, 3, 2, 1));
		System.out.println("max4(1, 2, 3, 4) = " + Solution01.max4(1, 2, 3, 4));
	}
}
