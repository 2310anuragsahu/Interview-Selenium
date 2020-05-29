package demo.Interview;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "Anurag Sahu";
		
		//String reverse = new StringBuilder(name).reverse().toString();
		String reverse = new StringBuffer(name).reverse().toString();
		
		System.out.println(reverse);
	}

}
