
public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a = 2;
		for(int i = 0; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + a*i );
		}*/
		
		/*int sumEven = 0;		
		int sumOdd = 0;
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0)
				sumEven = sumEven + i;
			if(i % 2 == 1)
				sumOdd = sumOdd + i;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		*/
		
		int reverse = 0;
		int n = 123;
		while (n != 0) {
			int temp = (n % 10);
			n = n / 10;
			reverse = reverse * 10 + temp;
		}
		System.out.println(reverse);
	}

}
