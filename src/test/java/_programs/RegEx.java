package _programs;

public class RegEx {

	public static void main(String[] args) {

		String email = "2310anurag@gmail.co.in";

		String regex = "^[A-Za-z0-9.-]+@[A-Za-z0-9-]+\\.[A-Za-z]*\\.?[A-Za-z]+$";

		/*
		 * ^ matches the starting of the sentence.
		 * 
		 * [a-zA-Z0-9+_.-] matches one character from the English alphabet (both cases),
		 * digits, “+”, “_”, “.” and, “-” before the @ symbol.
		 * 
		 * + indicates the repetition of the above-mentioned set of characters one or
		 * more times.
		 * 
		 * @ matches itself.
		 * 
		 * [a-zA-Z0-9.-] matches one character from the English alphabet (both cases),
		 * digits, “.” and “–” after the @ symbol.
		 * 
		 * $ indicates the end of the sentence.
		 */
		
		if(email.matches(regex)) {
			System.out.println("Under define standard");
		} else {
			System.out.println("Invalid");
		}
	}
}
