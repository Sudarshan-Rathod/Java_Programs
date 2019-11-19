//PROGRAM TO CHECK MAXIMUM OF 3 NOS 

package assignment_1;
import java.util.*;

public class Max_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no a: ");
		a=sc.nextInt();
		System.out.println("enter 2nd no b: ");
		b=sc.nextInt();
		System.out.println("enter 3rd no c: ");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
			
			else
			{
				System.out.println(c+" is greater");
			}
		}
		else
		{
			System.out.println(b+" is greater");
		}

	}

}
