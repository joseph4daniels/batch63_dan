
public class sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumEvenOdd(1, 10);
	}
	
	static void sumEvenOdd(int a, int b) {
		int i = 0;
		int sumEven = 0;
		int sumOdd = 0;
		for(i = a; i <= b; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			}
			else {
				sumOdd += i;
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
