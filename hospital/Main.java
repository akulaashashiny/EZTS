package hospital;
public class Main {

	public static void main(String[] args) {
		Person p = new Person("xyz","Female",22);
		System.out.println(p.toString());
		p.PersonOutput();
		Nurse n = new Nurse("abc","male",24,200,"1st");
		System.out.println(n.toString());
		n.NurseOutput();
		Patient pa = new Patient("ghij","male",23,"Typhoid",22);
		System.out.println(pa.toString());
		pa.PatientOutput();
		Doctor d = new Doctor("klmn","male",24,"general Physician");
		System.out.println(d.toString());
		d.DoctorOutput();
	}

}
