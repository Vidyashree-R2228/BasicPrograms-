package Loops;
import java.util.Scanner;
public class doodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		do {
			if(num%2!=0) {
				System.out.println("odd");
			}else {
				System.out.println("even");
			}

			
		}while(num==0);
		

	}

}
