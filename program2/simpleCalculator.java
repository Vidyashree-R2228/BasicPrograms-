package program2;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=10.5;
		double num2=2.5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Operator");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.println("result : "+num1+num2);
			break;
		case '-':
			System.out.println( num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
			
		}
		

	}

}
