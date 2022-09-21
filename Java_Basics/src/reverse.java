
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(123);
	}
	
	static void reverse(int a)
	{
		int res = 0;
		while(a != 0)
		{
			int temp = a % 10;
			res = res * 10 + temp;  
			a = a / 10;
		}
		System.out.println(res);
	}

}
