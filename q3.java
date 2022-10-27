package Lab8;

import java.util.*;

public class q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5, sum, average;
		
		System.out.println("Enter five numbers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		
		sum = num1+num2+num3+num4+num5;
		
		average = sum/5;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
		

	}

}
