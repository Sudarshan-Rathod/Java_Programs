//PROGRAM TO CHECK WHETHER ALPHABET IS SMALL OR CAPITAL
package assignment_1;
import java.util.*;

public class Alphabet_Small_Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character:");
		char ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
			System.out.println(ch+" is Uppercase Alphabet");
		else if(ch>=97 && ch<=122)
			System.out.println(ch+" is Lowercase Alphabet");
		else
			System.out.println(ch+" is Not a Alphabet");

	}

}
