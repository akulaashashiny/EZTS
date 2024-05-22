package hospital;

public class Nurse extends Person {
	private int RoomNo;
	private String Floor;
	public Nurse(String name, String gender, int age, int roomNo, String floor) {
		super(name, gender, age);
		RoomNo = roomNo;
		Floor = floor;
	}
	@Override
	public String toString() {
		return "Nurse [RoomNo=" + RoomNo + ", Floor=" + Floor + ", toString()=" + super.toString() + "]";
	}
	void NurseOutput() {
		super.PersonOutput();
		System.out.println("Room Number="+RoomNo);
		System.out.println("Floor number="+Floor);
	}

}
