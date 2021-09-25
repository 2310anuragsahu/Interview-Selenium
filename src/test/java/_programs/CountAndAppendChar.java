package _programs;

public class CountAndAppendChar {

	public static void main(String[] args) {

		//  Input - aaaaabbbbcfcaa
		//	output- a5b4c1f1c1a2
		
		String string = "aaaaabbbbcfcaa";
		
		for (int i = 0; i < string.length(); i++) {
			 
            // Counting occurrences of string[i]
            int count = 1;
            while (i + 1 < string.length() && string.charAt(i) == string.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(string.charAt(i) + "" + count);
        }
	}
}
