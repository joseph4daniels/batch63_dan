
public class exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp(2,4);
		exp(1, 10);
		exp(10, 1);
	}
	
	static void exp(int a, int b) {
		int res = 1;
		for(int i = 0; i < b; i++) {
			res = res * a;
		}
		System.out.println(res);
	}

}
