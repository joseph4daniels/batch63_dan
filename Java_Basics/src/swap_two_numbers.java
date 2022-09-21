
class A{
	
	void swap(int a, int b) {
		
		int temp1 = a;
		int temp2 = b;
		b = temp1;
		a = temp2;
		
		System.out.println("a is " + a + ", b is " + b);
	}
}

public class swap_two_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 3;
		System.out.println("a is " + a + ", b is " + b);
		
		A a1 = new A();
		a1.swap(a, b);

	}
	
}
