package _programs;

public class Palindrome {

	public static void main(String[] args) {
		
		// For Strings
		String name = "Naman";
		name = name.toLowerCase();
		System.out.println(name);
		
		String reverseName = new StringBuffer(name).reverse().toString();
		System.out.println(reverseName);
		
		if(reverseName.equalsIgnoreCase(name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		
		// For Integers
		int number = 12321;
		String s = String.valueOf(number);
		System.out.println(s);
		
		// Other Way
		int r, sum=0, temp;
		int n = 1234321;
		temp = n;
		
		while(n!=0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		
		if (temp==sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
