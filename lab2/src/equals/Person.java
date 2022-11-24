package equals;

import java.util.Objects;

public class Person {
	public String name;
	public int age;
	
	public Person(String n, int a) {
		this.age = a;
		this.name = n;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		Person p = (Person) o;
		return this.age == p.age && name.equals(p.name);
	}
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public String toString() {
		return "name:" + name;
	}
	
}
