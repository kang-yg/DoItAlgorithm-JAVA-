package chap01;

class Solution04{
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}
			else if(a <= c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(a > c) {
			return a;
		}
		else if(b > c) {
			return c;
		}
		else {
			return b;
		}
	}
}

public class Exercise04 {
	public static void main(String[] args) {
		System.out.println("med3(2, 1, 3) = " + Solution04.med3(2, 1, 3));
		System.out.println("med3(3, 1, 2) = " + Solution04.med3(3, 1, 2));
	}
}
