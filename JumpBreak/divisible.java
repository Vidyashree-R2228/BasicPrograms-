package JumpBreak;
import java.util.Scanner;
public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			if(i%5==0) {
			break;
			}
			System.out.println(i);
		}

		
	}

}
