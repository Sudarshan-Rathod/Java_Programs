//PROGRAM TO CHECK WHETHER A NO IS DIVISIBLE BY BOTH 
//5 AND 11 OR NOT

package assignment_1;
import java.util.*;
public class Five_11_divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		
		if(a%5==0 && a%11==0)
		{
			System.out.println(a+" is divisible by both 5 & 11");
		}
		else
			System.out.println(a+" not divisible by both 5 & 11");

	}

}
