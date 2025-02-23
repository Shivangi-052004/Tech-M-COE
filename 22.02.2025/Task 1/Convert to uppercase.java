package sample;

import java.util.Scanner;

public class Convt_to_Uppercase {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.next();
		 char[] chars = word.toCharArray();
		for(int i =0;i<chars.length;i++)
		{
			if( i % 2 == 0)
			{
				chars[i]= (char) (chars[i] - 32);
			}
		}
		String str = new String(chars);
		System.out.println("The converted string: "+str.toString());
		
	}

}
