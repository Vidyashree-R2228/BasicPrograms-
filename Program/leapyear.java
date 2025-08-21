package Program;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%400==0) {
			System.out.println("is a leap year");
		}else if(num%4==0 && num%100!=0) {
			System.out.println("is a leap year");
		}else {
			System.out.println("it is not a leap year");
		}
		
	}

}
