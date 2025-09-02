package program2;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		String ch=sc.next().toUpperCase();
		
		switch(ch) {
		case "A":
			System.out.println("choice A");
			break;
		case "B":
			System.out.println("choice B");
			break;
			
		case "C":
			System.out.println("choice C");
			break;
			
		}
	}

}
