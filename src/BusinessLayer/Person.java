package BusinessLayer;

public class Person {
	private String ID;
	private String FullName;
	private int Age;
	
	public Person(String iD, String fullName, int age) {
		super();
		ID = iD;
		FullName = fullName;
		Age = age;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", FullName=" + FullName + ", Age=" + Age + "]";
	}

}
