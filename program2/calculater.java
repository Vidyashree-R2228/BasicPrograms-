package program2;

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2,8);
		substraction(9,7);
		difference(10,5);
		

	}
	public static void sum(int num1,int num2) {
		int add=(num1+num2);
		System.out.println("Adding of the two number: "+ add);
	}
	public static void substraction(int num1,int num2) {
		int sub=(num1-num2);
		System.out.println("subtarction of the two number: "+ sub);
	}

	public static void difference(float num1,float num2) {
		float differ=(num2/num1);
		System.out.println("Division of the two number: "+ differ);
	}
}
