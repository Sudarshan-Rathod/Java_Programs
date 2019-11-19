//INPUT MARKS OF 5 SUBJECT ...CALCULATE % AND GRADES

package assignment_1;
import java.util.*;
public class Subject_percentage_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,cpp,java,python,html;
		float sum=0;
		double percentage;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks out of 100: ");
		c=sc.nextInt();
		cpp=sc.nextInt();
		java=sc.nextInt();
		python=sc.nextInt();
		html=sc.nextInt();
		
		sum=c+cpp+java+python+html/500;
		percentage=sum/5;
		
		System.out.println(percentage);
		
		if(percentage>75)
			System.out.println("Grade A");
		else if(percentage>60 && percentage<75)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
		
		

	}

}
