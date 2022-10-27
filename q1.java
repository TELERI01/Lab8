package Lab8;

import java.util.*;

public class q1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		do {
			System.out.println("Enter a number between 1 and 7: ");
			input = scan.nextInt();
		
		
			switch(input) {
		
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Number out of range!");
				break;
			}
		}
		while(input!= '1');	
	
	}
	
}
