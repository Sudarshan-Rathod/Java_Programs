//COMPANY DECIDED TO GIVE BONOUS OF 5% IF THE EMPLOYEE HAS
//MORE THAN 5 YEARS.PRINT NET SALARY

package assignment_1;
import java.util.*;

public class Bonous_five_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salary;
		double service,bonus,net_salary;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary");
		salary=sc.nextInt();
		System.out.println("enter the year of service");
		service=sc.nextDouble();
		
		if(service>5)
		{
			bonus=0.05*salary;
			net_salary=salary + bonus;
			System.out.println(net_salary);
		}
		else
			net_salary=salary;
		System.out.println(net_salary);
		
		
	}

}
