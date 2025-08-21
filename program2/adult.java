package program2;

import java.util.Scanner;

public class adult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		adult(num);

	}
	public static void adult(int age) {
	if(age>=18) {
		System.out.println("Adult");
	}else {
		System.out.println("not adult");
	}
		
	}

}
