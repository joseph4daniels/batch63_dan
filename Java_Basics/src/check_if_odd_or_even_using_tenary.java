
public class check_if_odd_or_even_using_tenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(check(6));
		System.out.println(check(5));
		
	}
	
	static String check(int a) {
		String res = (a % 2 == 0) ? "a is even" : "a is odd";
		return res;
	}

}
