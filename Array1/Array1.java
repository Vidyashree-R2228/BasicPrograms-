package Array1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the name ");
	    int num=sc.nextInt();
	    double[]perarr=new double[num];
	    for(int i=0;i<=perarr.length;i++) {
	    	System.out.println("enter the percentage of student"+(i+1));
	    	perarr[i]=sc.nextDouble();
	    }
	    for(int i=0;i<=perarr.length-1;i++) {
	    	System.out.println(perarr[i]);
	    }
	    
	}

}
