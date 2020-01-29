package chap01;

class Solution02 {
	static int min3(int a, int b, int c) {
		int result = a;
		if (result > b) {
			result = b;
		}
		if (result > c) {
			result = c;
		}

		return result;
	}
}

public class Exercise02 {
	public static void main(String[] agrs) {
		System.out.println("min3(3, 2, 1) = " + Solution02.min3(3, 2, 1));
		System.out.println("min3(1, 2, 3) = " + Solution02.min3(1, 2, 3));
	}
}
