package hospital;

public class Patient extends Person {
	private String Disease;
	private int BedNo;
	public Patient(String name, String gender, int age, String disease, int bedNo) {
		super(name, gender, age);
		Disease = disease;
		BedNo = bedNo;
	}
	@Override
	public String toString() {
		return "Patient [Disease=" + Disease + ", BedNo=" + BedNo + ", toString()=" + super.toString() + "]";
	}
	void PatientOutput() {
		super.PersonOutput();
		System.out.println("Disease="+Disease);
		System.out.println("Bed Number="+BedNo);
	}
}
