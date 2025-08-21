package program2;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		
		
		if(temp>=20 && temp<=30) {
			System.out.println("Temperature is more ");
		}else {
			System.out.println("less temperature");
		}

	}

}
