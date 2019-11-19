//PROGRAM TO CHECK EVEN OR ODD

package assignment_1;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int a=sc.nextInt();
		
		if(a%2==0)
			System.out.println(a+" is EVEN");
		else
			System.out.println(a+" is ODD");
		
		

	}

}
