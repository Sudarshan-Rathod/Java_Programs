//PROGRAM TO CHECK MAXIMUM OF 2 NOS 

package assignment_1;
import java.util.*;

public class Max_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number a: ");
		a=sc.nextInt();
		System.out.print("enter 2st number b: ");
		b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater of two");
		}
		else
		{
			System.out.println(b+" is greater of two");
		}
		
		

	}

}
