//PROGRAM TO FIND WHETHER TRIANGLE IS EQUILATERAL ISOSCELOUS OR SCELEN

package assignment_1;
import java.util.*;

public class Type_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of triangle a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b && a==c)
		
			System.out.println("Equilateral Triangle");
		
		else if(a==b||b==c||a==c)

				System.out.println("Isosceleous Triangle");
			
		else
			System.out.println("Scelen Triangle");

	}

}
