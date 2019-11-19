//PROGRAM TO PRINT WEEK DAY WHEN NO IS INPUT

package assignment_1;
import java.util.Scanner;
public class WeekDay_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int day=sc.nextInt();
		String dayname="";
		
		switch(day)
		{
		
		case 1:dayname="Monday";break;
		case 2:dayname="Tuesday";break;
		case 3:dayname="Wensday";break;
		case 4:dayname="Thrusday";break;
		case 5:dayname="Friday";break;
		case 6:dayname="Saturday";break;
		case 7:dayname="Sunday";break;
		default:dayname="not valid day";break;
		
		}
		System.out.println(dayname);
		
	}

}
