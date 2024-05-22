package hospital;

public class Doctor extends Person{
	private String Speciality;

	public Doctor(String name, String gender, int age, String speciality) {
		super(name, gender, age);
		Speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctor [Speciality=" + Speciality + ", toString()=" + super.toString() + "]";
	}
	void DoctorOutput() {
		super.PersonOutput();
		System.out.println("Speciality="+Speciality);
	}
}
