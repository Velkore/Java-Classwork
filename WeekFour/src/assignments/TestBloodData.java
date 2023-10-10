package assignments;

import java.util.Scanner;

public class TestBloodData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BloodData bloodData = new BloodData();
		Scanner n = new Scanner(System.in);
		String bloodType;
		String rhFactor;
		
		bloodType = bloodData.getBloodType();
		rhFactor = bloodData.getRhFactor();
		System.out.println("Default values are : " + bloodType + rhFactor);
		
		bloodData.setBloodType("A");
		bloodData.setRhFactor("-");
		
		bloodType = bloodData.getBloodType();
		rhFactor = bloodData.getRhFactor();
		System.out.println("Assigned values are : " + bloodType + rhFactor);
		
		System.out.println("What is your blood type (A, B, O, AB)?");
		String userBloodType = n.nextLine();
		System.out.println("What is your RH factor (+ or -)?");
		String userRhFactor = n.nextLine();
		
		bloodData.setBloodType(userBloodType);
		bloodData.setRhFactor(userRhFactor);
		
		bloodType = bloodData.getBloodType();
		rhFactor = bloodData.getRhFactor();
		
		System.out.println("Blood Data : " + bloodType + rhFactor);
	}

}
