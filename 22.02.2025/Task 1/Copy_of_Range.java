package sample;

import java.util.Arrays;

public class Copy_of_Range {
	public static void main(String[] args)
	{
		int[] A = { 1,2,3,4,5,6,7,8,9,10};
		int[] B = Arrays.copyOfRange( A, 1, 6);
	  System.out.println("Array of the specified string: " +Arrays.toString(B));
	}

}
