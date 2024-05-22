package vehicle_oops;

public class Bus extends Vehicle {
	int Passengers;

	public Bus(int model, int engine, String color, int passengers) {
		super(model, engine, color);
		Passengers = passengers;
	}

	@Override
	public String toString() {
		return "Bus [Passengers=" + Passengers + ", toString()=" + super.toString() + "]";
	}

	void busOutput() {
		super.VehicleOutput();
		System.out.println("No.of Passengers="+Passengers);
	}

}
