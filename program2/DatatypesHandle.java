package program2;

public class DatatypesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float athlete1Weight=68.45f;
		float athlete2Weight=70.55f;
		System.out.println("Weight of Athlete 1 "+ athlete1Weight);
		System.out.println("Weight of Athlete 2 "+ athlete2Weight);
		
		double athlete1Time=9.8576341234;
		double athlete2Time=10.0012345678;
		System.out.println("Time taken by athlete1"+athlete1Time +"secounds");
		System.out.println("Time taken by athlete2"+athlete2Time +"secounds");
		
		String winner=(athlete1Time < athlete2Time ?"Athlete 1":"Athlete 2");
		System.out.println("Winner of the race "+winner);
	}

}
