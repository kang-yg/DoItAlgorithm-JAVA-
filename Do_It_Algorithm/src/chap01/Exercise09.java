package chap01;

class Solution09 {
	static void SumOf(int a, int b) {
		int sum = 0;
		int bigger = (a > b) ? a : b;
		int smaller = (a < b) ? a : b;

		for (int i = smaller; i <= bigger; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

public class Exercise09 {
	public static void main(String[] args) {
		Solution09.SumOf(3, 5);
		Solution09.SumOf(6, 4);
	}
}
