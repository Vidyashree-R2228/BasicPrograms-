package Loops;
import java.util.Scanner;
public class sumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the natural number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		
		}
		System.out.println(sum);
		
		
	}

}
