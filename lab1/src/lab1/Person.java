package lab1;

public class Person {
	public Gender gender;
	private String name;
	
	public Person(String name) {
		this.name = name;
		
	}
	
	public Person (Gender gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
}
