//STUDENT WILL NOT BE ALLOWED TO SIT IN EXAM IF HIS ATTENDANCE 
//less than 75%....input=no of classes conducted...and no of classes attended


package assignment_1;
import java.util.*;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int class_held,class_attain;
		double percen;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of classes held");
		class_held=sc.nextInt();
		System.out.println("enter the no of classes attainted");
		class_attain=sc.nextInt();
		
		percen=(class_held/class_attain)*100;
		
		if(percen>75)
		{
			System.out.println(percen);
			System.out.println("Allowed");
		}
		else
			System.out.println(percen);
			System.out.println("NOT Allowed");

	}

}
