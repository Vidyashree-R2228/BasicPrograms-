package Loops;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=20;
		System.out.println("even number");
		int n=i;
		while(n<=j) {
			if(n%2==0) {
				System.out.print(n + " ");
			}
			n++;
		
		}
		 System.out.println("\nOdd numbers:");
	        int k = i;
	        while (k <= n) {
	            if (k % 2 != 0) {
	                System.out.print(k + " ");
	            }
	            k++;
	        }
	    }
		
}


