package program2;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float interest=calculateInterest();
		System.out.println(interest);
		

	}
	public static float calculateInterest(){
		float principal=1000.0f;
		float rate=30.0f;
		int time=5;
		
		float simpleInterst=(principal*rate*time)/100;
		return simpleInterst;
		
		
	}

}
