package _programs;

public class CountOccurrencesOfChar {

	public static void main(String args[]) {
		
        String str = "Anurag $ahu";
        int i, length;
        
        // There are 2^8 = 256 chars in an extended ASCII char set.
        // Check it here. http://www.ascii-code.com/
        int counter[] = new int[256];
 
        //str = str.toLowerCase();
        length = str.length();
 
        // Count frequency of every character and store it in counter array
        for (i = 0; i < length; i++) {
        	if(str.charAt(i) != ' ')
        		counter[(int) str.charAt(i)]++;
        }
        
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }

}
