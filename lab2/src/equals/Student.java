package equals;

import java.util.Objects;

public class Student extends Person{
	int ID;	
	
	public Student(String n, int a) {
		super(n, a);
	}
	
	public Student(String n, int a, int ID) {
		super(n, a);
		this.ID = ID;
	}

	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Student s = (Student) o;
		return s.ID == this.ID;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(), ID);
	}
	
	public String toString() {
		return super.toString()+'\n' + "ID: " + ID;
	}
}
