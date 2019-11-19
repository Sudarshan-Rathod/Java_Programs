//PROGRAM TO CHECK WHETHER CHARACTER IS ALPHABET OR NOT

package assignment_1;

import java.util.Scanner;

public class Alphabet_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character:");
		char a=sc.next().charAt(0);
		
		if((a>='a' && a<='z')||(a>='A' && a<='Z'))
			System.out.println("It is Alphabet");
		else
			System.out.println("It is NOT Alphabet");
		
		

	}

}
