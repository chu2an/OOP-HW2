package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		String saa,sbb;
		while(true)
		{
			System.out.print("Enter a string 1 :");
			saa=keyboard.next();
			System.out.print("Enter a string 2 :");
			sbb=keyboard.next();
			if(saa.compareToIgnoreCase(sbb)==0)
			{
				System.out.println("The two string are same.");
				break;
			}
			else
			{
				System.out.println("The two string are not same.");
			}
		}
		keyboard.close();
	}

}
