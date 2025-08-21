package program2;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,rem,temp;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp/=10;
			
		}
	
		if(num==sum) {
			System.out.println("it is palindrom");
		}else {
			System.out.println("it is no palindrome");
		}
}
}
