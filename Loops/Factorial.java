package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int factorial=1;
		while(num>0) {
			factorial*=num;
			num--;
			
		}
		System.out.println(factorial);

	}

}
