//PROGRAM TO CHECK WHETHER CHAR IS VOWEL OR CONSONANT

package assignment_1;

import java.util.Scanner;

public class Vowel_consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character:");
		char a=sc.next().charAt(0);
		
		if((a>='a' && a<='z')||(a>='A' && a<='Z'))
		{
			if((a=='a'||a=='A')||(a=='e'||a =='E')||(a=='i'||a=='I')||(a=='o'||a=='O')||(a=='u'||a=='U'))
				System.out.println(a+" is Vowel");
			else
				System.out.println(a+" is Consonant");
		}
		else
		{
			System.out.println("It is not character");
		}
		

	}

}
