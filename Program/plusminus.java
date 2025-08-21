package Program;

import java.util.Scanner;

public class plusminus {


	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int result=sc.nextInt();
		if(result>0) {
			System.out.println("Number is positive");
			
		}else {
			System.out.println("Number is negative");
		}
		

	}

}
