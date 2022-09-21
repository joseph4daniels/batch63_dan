
public class check_prime_message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPrime(15)) {
			System.out.println("is prime");
		}
		else {
			System.out.println("is not prime");
		}
	}

	static boolean isPrime(int a) 
	{
		if(a <= 0) 
		{
			return false;
		}
		int i = 0;
		for(i = 1; i < a; i++) 
		{
			System.out.println(i);
			if(a % i == 0 && i != 1) 
			{
				return false;
			}
		}
		return true;
	}
}
