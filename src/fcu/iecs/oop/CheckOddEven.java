package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven 
{

	
	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		int intnumber;
		System.out.print("Input a number :");
		intnumber=keyboard.nextInt();
		if(intnumber==0)
		{
			System.out.println("The input integer is Zero number");
		}
		else if(intnumber%2==0)
		{
			System.out.println("The input integer is Even number");
		}
		else
		{
			System.out.println("The input integer is Odd number");
		}

	}

}
