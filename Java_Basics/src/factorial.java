
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(4);
	}
	
	static void fact(int i) {
		int res = 1;
		while(i != 0) {
			res = res * i;
			i = i - 1;
		}
		System.out.println(res);
	}

}
