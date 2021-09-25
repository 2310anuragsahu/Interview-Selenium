package _programs;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberArray {

	public static void main(String[] args) {

		// int[] arr = {1, 2, 3, 4, 5};
		// int arr[] = {1, 2, 3, 4, 5};
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10}; 

		for(int i=0; i < intArray.length; i++)
		{
			if(checkPrime(intArray[i]))
				System.out.println(intArray[i] +" is a Prime Number");
			else
				System.out.println(intArray[i] +" is not a Prime Number");
		}
	}

	public static boolean checkPrime(int n)
	{
		if(n <= 1)
			return false;
		for(int i=2; i<= n/2; i++)
		{
			if((n % i) == 0)
				return false;
		}
		return true;
	}
}
