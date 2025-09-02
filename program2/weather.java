package program2;
import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to get to know the weather");
		int result=sc.nextInt();
		String season;
		switch(result) {
		case 1: case 2: case 12:
			System.out.println("Winter Season");
			break;
			
		case 3: case 4: case 5:
			System.out.println("Spring Season");
			break;
		case 6:case 7:case 8:
			System.out.println("Summer Season");
			break;
			
		case 9:case 10: case 11:
			System.out.println("Auntum Season");
			break;
		
		}
		
		
		

	
		
		
	
		
	}
}
