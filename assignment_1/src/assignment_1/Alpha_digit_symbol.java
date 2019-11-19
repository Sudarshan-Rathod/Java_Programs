//PROGRAM TO CHECK WHETHER INPUT IS CHARACTER, DIGIT OR SPECIAL SYMBOL

package assignment_1;
import java.util.*;

public class Alpha_digit_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character:");
		char ch=sc.next().charAt(0);
		
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
			System.out.println(ch+" is Alphabet");
		
		else if(ch>=48 &&ch<=57)
			System.out.println(ch+" is Digit");
		else
			System.out.println(ch+" is Special Symbol");
		

	}

}
