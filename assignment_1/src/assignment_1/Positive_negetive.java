//PROGRAM TO CHECK WHETHER A NO IS POSITIVE,NEGETIVE OR ZERO

package assignment_1;
import java.util.*;

public class Positive_negetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int a=sc.nextInt();
		
		if(a==0)
		{
			System.out.println(a+" is ZERO");
		}
		else
		{
			if(a>0)
			{
				System.out.println(a+" is POSITIVE");
			}
			else
			{
				System.out.println(a+" is NEGETIVE");
			}
		}

	}

}
