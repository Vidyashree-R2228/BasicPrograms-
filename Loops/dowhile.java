package Loops;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int num=3;
		do {
			System.out.println("Menu");
			System.out.println("1.Option 1");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("4.Exit");
			
			System.out.println("choose the num");
			switch(num) {
			case 1:
				System.out.println("you choose Option 1");
				break;
			case 2:
				System.out.println("you choose Option 2");
				break;
				
			case 3: 
				System.out.println("you choose Option 3");
				break;
				
			case 4:
				System.out.println("you choose Exited");
				break;
			default:
				System.out.println("Invalid choice ,Please try again.");
			
			}
			
		}while(num!=3);

	}

}
