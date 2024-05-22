package vehicle_oops;

public class Vehicle {
	private int Model;
	private int Engine;
	private String Color;	
	
	public Vehicle(int model, int engine, String color) {
		Model = model;
		Engine = engine;
		Color = color;
	}


	@Override
	public String toString() {
		return "Vehicle [Model=" + Model + ", Engine=" + Engine + ", Color=" + Color + "]";
	}

	void VehicleOutput() {
		System.out.println("Model = " + Model);
		System.out.println("Engine = " +Engine);
		System.out.println("Colour = " +Color);
	}
	
}
