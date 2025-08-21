package program2;

import java.util.Scanner;

public class multipleof5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		check(num);
		
		
		
	}	
		public static void check(int num) {
		
		if(num%5==0) {
			System.out.println("number is divisable by 5");
		}
		else {
			System.out.println("It is not divisible by 5");
		}
		
		}
	}
	

