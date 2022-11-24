package Problem2;

import java.util.Objects;


public class Iphone extends Apple{
	int model;
	
	public Iphone() {
		super();
	}
	public Iphone(String color, int year, int model) {
		super(color, year);
		this.model = model;
	}
	public void getCall() {
		System.out.print("Call a friend..!" + "\n");
	}
	
	public String toString() {
		return super.toString() + " " + " Model " + model;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Iphone apl = (Iphone) o;
		return apl.model == this.model;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), model);
	}
}
