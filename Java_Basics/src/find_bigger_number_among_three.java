
public class find_bigger_number_among_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = find(-20,11,32);
		System.out.println("bigger number is " + res);
		
		
	}
	
	static int find(int a, int b, int c) {
		
		int biggerNum = 0;
		
		if(a > biggerNum) {
			biggerNum = a;
		}
		
		if(b > biggerNum) {
			biggerNum = b;
		}
		
		if(c > biggerNum) {
			biggerNum = c;
		}
			
		return biggerNum; 
	}

}
