//PROGRAM TO FIND TRIANGLE IS VALID OR NOT

package assignment_1;
import java.util.*;

public class Triangle_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of triangle a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a+b+c==180)
		
			System.out.println("it is valid Triangle");
		
		else
			System.out.println("it is not valid Triangle");


	}

}
