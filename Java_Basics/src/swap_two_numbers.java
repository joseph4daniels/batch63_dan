
class A{
	static int a = 0;
	static int b = 1;
	
	void swap() {
		System.out.println(a + "," + b);
		
		int temp1 = a;
		int temp2 = b;
		b = temp1;
		a = temp2;
		
		System.out.println(a + "," + b);

	}
}

public class swap_two_numbers {
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A a1 = new A();
		a1.swap();
		
	}
	
}
