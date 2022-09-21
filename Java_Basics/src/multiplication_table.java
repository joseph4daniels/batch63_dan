
class B{
	
	void multi(int a) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + a*i );
		}
	}
}

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B a1 = new B();
		a1.multi(3);
	}

}
