package vehicle_oops;

public class Car extends Vehicle {
	private String FuelType;
	
	public Car(int model, int engine, String color, String fuelType) {
		super(model, engine, color);
		FuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [FuelType=" + FuelType + ", toString()=" + super.toString() + "]";
	}

	void carOutput() {
		super.VehicleOutput();
		System.out.println("Car Fuel Type="+FuelType);
	}
}
