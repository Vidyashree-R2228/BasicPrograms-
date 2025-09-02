package program2;
import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter to Know the Traffic signal");
		String ch=sc.next().toLowerCase();
		
	
		switch (ch) {
		case "r":
			System.out.println("STOP");
		break;
		case "y":
			System.out.println("READY");
		break;
		case "g":
			System.out.println("GO");
		break;
		
		}

	}

}
