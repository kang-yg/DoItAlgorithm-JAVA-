package chap01;

class Solution06 {
	static int SumWhile(int a) {
		int sum = 0;
		int i = 1;

		while (i <= a) {
			sum += i;
			i++;
		}
		return i;
	}
}

public class Exercise06 {
	public static void main(String[] args) {
		System.out.println("����� �� i�� : " + Solution06.SumWhile(5));
	}
}
