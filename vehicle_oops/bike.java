package vehicle_oops;

public class bike extends Vehicle {
	private String Type;
	
	public bike(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
	}
	



	@Override
	public String toString() {
		return "bike [Type=" + Type + ", toString()=" + super.toString() + "]";
	}




	void bikeOutput() {
		super.VehicleOutput();
		System.out.println("Bike Type="+Type);
	}
}
