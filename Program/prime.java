package Program;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkPrime(n);
		
	}

	private static void checkPrime(int n) {
		int count =0;
		if(n<2) {
			System.out.println("the given number "+ n +" is not prime");
			
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count+=1;
			}
			}
			if(count>2) {
				System.out.println("the given number is "+ n +" not prime");
			}else {
				System.out.println("the given number "+ n +" is prime");
			
		}
	}

}
