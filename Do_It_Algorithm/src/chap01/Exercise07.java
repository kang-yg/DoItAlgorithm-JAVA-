package chap01;

class Solution07 {
	static void SumFor(int a) {
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			if (i < a) {
				System.out.print(i + " + ");
			}
			else {
				System.out.print(i);
			}
			sum += i;
		}
		System.out.println(" = " + sum);
	}
}

public class Exercise07 {
	public static void main(String[] args) {
		Solution07.SumFor(7);
	}

}
