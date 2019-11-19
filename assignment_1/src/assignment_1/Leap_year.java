//PROGRAM TO FIND LEAP YEAR

package assignment_1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the YEAR:");
		int year=sc.nextInt();
		
		if(year%400 == 0) // Exactly divisible by 400 e.g. 1600, 2000
		    System.out.println("Leap Year"+year);
		    
		  else if (year%100 == 0) // Exactly divisible by 100 and not by 400 e.g. 1900, 2100
		    System.out.println("not Leap Year"+year);
		    
		  else if (year%4 == 0) // Exactly divisible by 4 and neither by 100 nor 400 e.g. 2016, 2020
			  System.out.println("Leap Year"+year);
		    
		  else // Not divisible by 4 or 100 or 400 e.g. 2017, 2018, 2019
			  System.out.println("not Leap Year"+year);
		
	}

}
