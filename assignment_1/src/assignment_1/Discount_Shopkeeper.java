//shop will give discount of 10% if the cost of purchased quantity is more
//than 1000. ask user for a quantity.one unit will cost=100
//judge and print total cost for user

package assignment_1;
import java.util.*;


public class Discount_Shopkeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int originalcost;
		int quantity;
		double prize;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity..");
		quantity=sc.nextInt();
		
		originalcost=100*quantity;
		
		if(quantity>=1000)
		{
			
			prize=originalcost-(0.1*originalcost);
			System.out.println(prize);
		}
		else
		{
			System.out.println(originalcost);
		}
		
		

	}

}
