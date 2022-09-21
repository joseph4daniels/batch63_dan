
public class vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isVowel("a")) {
			System.out.println("is a vowel");
		}
		else {
			System.out.println("is a consonant");
		}
	}

	static boolean isVowel(String s) {
		
		if(s.equals("a")) {
			return true;
		}
		if(s.equals("e")) {
			return true;
		}
		if(s.equals("i")) {
			return true;
		}
		if(s.equals("o")) {
			return true;
		}
		if(s.equals("u")) {
			return true;
		}
		return false;
	}
	
}
