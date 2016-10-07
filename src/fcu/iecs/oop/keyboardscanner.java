package fcu.iecs.oop;

import java.util.Scanner;

public class keyboardscanner {

	
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int intnumber;
		float floatnumber;
		String name;
		System.out.println("Input a number");
		intnumber=keyboard.nextInt();
		System.out.println("Input a Float number");
		floatnumber=keyboard.nextFloat();
		System.out.println("Input a name");
		name=keyboard.next();
		
		System.out.print("Hi "+name+", the multipilcation of "+intnumber+" and "+floatnumber+" is ");
		System.out.printf("%e",intnumber*floatnumber);

	}

}
