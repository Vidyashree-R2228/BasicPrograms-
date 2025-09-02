package program2;

import java.util.Scanner;

public class SeniorCitizen {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int result=sc.nextInt();
		senior(result);
		
		

	}
	public static void senior(int num) {
		if(num>60) {
			System.out.println("Senior Citizen");
		}else {
			System.out.println("Not a Senior Citizen");
		}
		
	}

}
