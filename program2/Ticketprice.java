package program2;

import java.util.Scanner;

public class Ticketprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Whats your age ");
		int age =sc.nextInt();
		if(age<18) {
			System.out.println("Ticket for child");
		}else if(age>18 &&age<65) {
			System.out.println("Ticket for Adult");
		}else if(age>65) {
			System.out.println("Ticket price:Senior");
		}
	}

}
