package _programs;

import java.util.List;

public class ReversingASentence {

	public static void main(String[] args) {

		String input= "This is a String";
		// Output should be output=siht si a gnirts
		String output = null;

		input = input.toLowerCase();	// this is a string

		String[] list = input.split(" ");
		for(int i=0; i<list.length; i++)
		{
			if(i==0) {
				output = new StringBuffer(list[i]).reverse().toString();
			} else {
				output = output + " " + new StringBuffer(list[i]).reverse().toString();
			}
		}
		
		System.out.println(output);
	}
}
