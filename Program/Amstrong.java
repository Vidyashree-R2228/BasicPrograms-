package Program;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digits=String.valueOf(num).length();
		int sum=0;
		int temp=num;
		while(temp>0) {
			int digit=temp%10;
			sum+=(Math.pow(digit, digits));
			temp/=10;
		}
		if(num==sum) {
			System.out.println(num +" it is armstrong number");
			
		}else {
			System.out.println(num +" it is not armstrong number");
		}
		

	}

}
