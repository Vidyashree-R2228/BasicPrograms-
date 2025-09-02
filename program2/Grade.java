package program2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the score");
		int result=sc.nextInt();
		gradescore(result);		

	}
	public static void gradescore(int num) {
		if(num>=90 && num<=100) {
			System.out.println("Grade A : Excellent");
		}else if(num>=80 && num<=89) {
			System.out.println("Grade B : Very Good");
		}else if(num>=70 && num<=79) {
			System.out.println("Grade C : Good");
		}else if(num>=60 && num<=69) {
			System.out.println("Grade D : Needs improvement");
		}else {
			System.out.println("Fail");
		}
	}

}
