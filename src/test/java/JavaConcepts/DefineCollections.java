package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class DefineCollections {

	public static void main(String[] args) {
		
		// Declare Array
		int[] arr = {1, 2, 3, 4, 5};
		String[] names = {"john", "Johnny", "Tom", "Harry"};
		
		//Creating arraylist 
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		ArrayList<String> cities = new ArrayList<>( Arrays.asList("London", "Tokyo", "New York"));

		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		
	}
}
