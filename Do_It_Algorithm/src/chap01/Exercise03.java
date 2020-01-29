package chap01;

class Solution03{
	static int min4(int a, int b, int c, int d) {
		int result = a;
		if (result > b) {
			result = b;
		}
		if (result > c) {
			result = c;
		}
		if (result > d) {
			result = d;
		}

		return result;
	}
}

public class Exercise03 {
	public static void main(String[] agrs) {
		System.out.println("min4(4, 3, 2, 1) = " + Solution03.min4(4, 3, 2, 1));
		System.out.println("min4(1, 2, 3, 4) = " + Solution03.min4(1, 2, 3, 4));
	}
}
