package Controlstatements;

import java.util.Scanner;

public class evenORodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("it is the even number");
		}else
		{
			System.out.println("it is the odd number ");
		}
		
		

	}

}
