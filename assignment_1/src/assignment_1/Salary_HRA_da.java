//PROGRAM TO INPUT BASIC SALARY OF AN EMPLOYEE NA DTO CALCULATE 
//ITS GROSS SALARY ACCORDINGLY......


package assignment_1;
import java.util.*;

public class Salary_HRA_da {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary;
		double gross,HRA,DA;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary:");
		salary=sc.nextInt();
		
		if(salary<10000)
		{
			HRA=0.2*salary;
			DA=0.8*salary;
			gross=salary+HRA+DA;
			System.out.println(gross);
		}
		else if(salary>=10000 && salary<=20000)
		{
			HRA=0.25*salary;
			DA=0.9*salary;
			gross=salary+HRA+DA;
			System.out.println(gross);
			
		}
		else if(salary>=20000)
		{
			HRA=0.30*salary;
			DA=0.95*salary;
			gross=salary+HRA+DA;
			System.out.println(gross);
			
		}
		

	}

}
