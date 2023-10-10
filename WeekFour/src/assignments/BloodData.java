package assignments;

public class BloodData {
	private String rhFactor;
	private String bloodType;

	// Default values
	public BloodData() {
		bloodType = "O";
		rhFactor = "+";
	}
	
	public BloodData(String bloodType, String rhFactor) {
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}
	
	// Blood type getter
	public String getBloodType() {
		return bloodType;
	}
	
	// Blood type setter
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	// Rh getter
	public String getRhFactor() {
		return rhFactor;
	}
	
	// Rh setter
	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
}
