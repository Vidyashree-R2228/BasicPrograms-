package Program;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--) {
        	reverse+=name.charAt(i);
        }
        System.out.println(reverse);
	}
	

}
