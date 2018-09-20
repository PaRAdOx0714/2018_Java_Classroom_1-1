package 제07차시;

public class Car {
	String maker;
	String kind;
	String color;
	String serielNumber;
	String owner;
	int amountGasExhaust; 
	int status;
	int enableRunDistance;
	double fuelEfficiency; 
	double currentVelocity;
	double currentFuelEfficiency;
	
	void turnOn() {
		System.out.println("Car has turned on.");
	}
	
	void gearChange() {
		System.out.println("Gear changed.");
	}
	
	void speedCtrl() {
		System.out.println("Speed controled");
	}
	
	void directChange() {
		System.out.println("Direction changed.");
	}
	
	void turnOnDirtLight() {
		System.out.println("Turned on the direction light.");
	}
	
	void turnOnEmergeLight() {
		System.out.println("Turned on the emergency light.");
	}
	
	void horn() {
		System.out.println("Horned.");
	}
	
	void openGasEntry() {
		System.out.println("Open gas gate.");
	}
	
	void openHood() {
		System.out.println("Open Hood.");
	}
	
	void openSunloop() {
		System.out.println("Open sunloop");
	}
	
	void openTrunk() {
		System.out.println("Open trunk.");
	}

}
