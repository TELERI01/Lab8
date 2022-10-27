package Lab8;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		System.out.println("Enter a month: ");
		Scanner scan = new Scanner(System.in);
		
		String month = scan.next();
		int fill = 1;
		
		switch(month) {
		case "January":
			System.out.println("31");
			break;
		case "February":
			System.out.println("Enter a year: ");
			int year = scan.nextInt();
			if(year%4 == 0) {
				System.out.println("Year is a leap years: 29 days");
			}
			else
				System.out.println("28");
			
			System.out.println();
			break;
		case "March":
			System.out.println("31");
			break;
		case "April":
			System.out.println("30");
			break;
		case "May":
			System.out.println("31");
			break;
		case "June":
			System.out.println("30");
			break;
		case "July":
			System.out.println("31");
			break;
		case "August":
			System.out.println("31");
			break;
		case "Setpember":
			System.out.println("30");
			break;
		case "October":
			System.out.println("31");
			break;
		case "November":
			System.out.println("30");
			break;
		case "December":
			System.out.println("31");
			break;
		case "exit":
			System.exit(0);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
