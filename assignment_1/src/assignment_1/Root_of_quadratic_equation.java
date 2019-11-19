//PROGRAM TO FIND THE ROOT OF QUADRATIC EQUATION

package assignment_1;
import java.util.*;

public class Root_of_quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double a,b,c;
		double root1,root2,d,e;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b,c : ");
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		double c =sc.nextDouble();
		
		d=(b*b)-(4*a*c);
		
		if(d>0)
		{
			root1=((-b + Math.sqrt(d))/(2*a));
			root2=((-b - Math.sqrt(d))/(2*a));
			System.out.println("Roots :Distinct & Real :root1 = "+root1+ " and root2 = " + root2);

		}
		else if(d==0)
		{
			root1=root2=-b/2*a;
			System.out.println("Roots :Equal & Real: root1 = " + root1 + " and root2 = " + root2);

		}
		else if(d<0)
		{
			root1=root2=-b/2*a;
			e=Math.sqrt(-d)/(2*a);
			System.out.println("Roots :Distinct & Complex: root1 = " + root1 + " + " + e + "\t root2 = " + root2 +" - " +e);
			
		}

	}
}
