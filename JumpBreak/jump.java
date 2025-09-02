package JumpBreak;
import java.util.Scanner;
public class jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=10;i++) {
			int item=sc.nextInt();
			if(item==6) {
				System.out.println(item+"item not found");
			}else {
				System.out.println("check the item");
			}
			break;
		}
		

	}

}
