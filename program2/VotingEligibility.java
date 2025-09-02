package program2;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your age");
		int eligible=sc.nextInt();
		voting(eligible);

	}
	public static void voting(int num) {
		if(num>18) {
			System.out.println("eligible for voting");
		}else {
			System.out.println("not eligible for voting");
		}
		
	}

}
