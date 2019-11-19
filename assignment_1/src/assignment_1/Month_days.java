//PROGRAM TO PRINT MONTH DAY WHEN MONTH NO IS A INPUT

package assignment_1;
import java.util.*;
public class Month_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int day=sc.nextInt();
		String monthday="";
		
		switch(day)
		{
		
		case 1:monthday="January =31 days";break;
		case 2:monthday="February =28 or 29 days";break;
		case 3:monthday="March =31 days ";break;
		case 4:monthday="April=30 days";break;
		case 5:monthday="May=31 days";break;
		case 6:monthday="June=30 days";break;
		case 7:monthday="July=31 days";break;
		case 8:monthday="August=31 days";break;
		case 9:monthday="September=30 days";break;
		case 10:monthday="October=31 days";break;
		case 11:monthday="November=30 days";break;
		case 12:monthday="December =31 days";break;
		default:monthday="not valid month";break;
		
		}
		System.out.println(monthday);

	}

}
