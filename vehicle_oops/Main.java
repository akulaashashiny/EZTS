package vehicle_oops;
public class Main {

	public static void main(String[] args) {
		
		Vehicle vh = new Vehicle(2019,999,"red");
		System.out.println(vh.toString());
		vh.VehicleOutput();
		bike b=new bike(2019,99,"blue","Sports");
		System.out.println(b.toString());
		b.bikeOutput();
		Car c=new Car(2019,99,"pink","petrol");
		System.out.println(c.toString());
		c.carOutput();
		Bus s=new Bus(2019,99,"blue",20);
		System.out.println(s.toString());
		s.busOutput();
	}

}

	
