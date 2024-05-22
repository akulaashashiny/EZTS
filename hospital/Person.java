package hospital;
public class Person {
	private String Name,Gender;
	private int Age;
	
	public Person(String name, String gender, int age) {
		Name = name;
		Gender = gender;
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + "]";
	}

	void PersonOutput() {
		System.out.println("Name="+Name);
		System.out.println("Gender="+Gender);
		System.out.println("Age="+Age);
		
	}
}
