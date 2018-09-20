package 제07차시;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.maker = "Jaguar";
		myCar.kind = "Jaguar XF 2016";
		myCar.color = "Glossy black";
		myCar.serielNumber = "23누3190";
		myCar.owner = "Me";
		myCar.amountGasExhaust = 50; 
		myCar.status = 1;
		myCar.enableRunDistance = 10;
		myCar.fuelEfficiency = 7.2; 
		myCar.currentVelocity = 100;
		myCar.currentFuelEfficiency = 7.2;
		
		myCar.turnOn();
		
		myCar.gearChange();
		
		myCar.speedCtrl();
		
		myCar.directChange(); 
		
		myCar.turnOnDirtLight();
		
		myCar.turnOnEmergeLight();
		
		myCar.horn();
		
		myCar.openGasEntry();
		
		myCar.openHood();
		
		myCar.openSunloop();
		
		myCar.openTrunk();

	}

}
