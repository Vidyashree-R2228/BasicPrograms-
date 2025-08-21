package program2;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkprime(n);

	}

	private static void checkprime(int n) {
		int count=0;
		if(n<2) {
			System.out.println("it is not prime");
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count+=1;
			}
		}
		
		if(count>2) {
			System.out.println("it is not prime");
		}else {
			System.out.println("it is prime");
		}
	}

}
