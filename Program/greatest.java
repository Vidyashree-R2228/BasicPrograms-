package Program;
import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		System.out.println("Enter the number1");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("enter the number2");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("number1 is greater");
		}else {
			System.out.println("number2 is greater ");
		}
		
	}

}
