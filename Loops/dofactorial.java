package Loops;
import java.util.Scanner;
public class dofactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int N =sc.nextInt();
			int factorial=1;
		do {
			factorial*=N;
			N--;
			
		}while(N>0);
		System.out.println("Factorial : "+ factorial);

	}

}
