
public class find_bigger_number_among_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(3,2);
		find(2,4);
		find(5,5);
	}
	
	static void find(int a, int b) {
		if(a > b) {
			System.out.println("a is bigger than b, a is " + a);
		}
		else if (b > a) {
			System.out.println("b is bigger than a, b is " + b);
		}
		else {
			System.out.println("b equals a, a and b is " + b);
		}
	}
	
}
