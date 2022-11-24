package problem4;

import java.util.Objects;

public abstract class Person{
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		Person o1 = (Person)o;
		return this.name.equals(o1.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "name: " + name;
	}
}
