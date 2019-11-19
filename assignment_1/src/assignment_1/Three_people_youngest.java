//TAKE AGE OF 3 PEOPLE AND FIND OUT YOUNGEST AND 
//OLDEST

package assignment_1;
import java.util.*;

public class Three_people_youngest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println(" largest and smallest of three numbers");
	 
	        System.out.println("first number :");
	        int first = scanner.nextInt();
	 
	        System.out.println("second number :");
	        int second = scanner.nextInt();
	 
	        System.out.println("third number :");
	        int third = scanner.nextInt();
	 
	        int largest = largest(first, second, third);
	        int smallest = smallest(first, second, third);
	 
	        System.out.printf("largest: %d %n",largest);
	        System.out.printf("smallest: %d %n",smallest);
	 
	        scanner.close();
	    }
	
	 public static int largest(int first, int second, int third) {
	        int max = first;
	        if (second > max) {
	            max = second;
	        }
	 
	        if (third > max) {
	            max = third;
	        }
	 
	        return max;
	    }
	 
	    public static int smallest(int first, int second, int third) {
	        int min = first;
	        if (second < min) {
	            min = second;
	        }
	 
	        if (third < min) {
	            min = third;
	        }
	 
	        return min;
	    }

	}

