package Problem2;

import java.util.Objects;


public class Macbook extends Apple{
	int model;
	
	public Macbook() {
		super();
	}
	
	public Macbook(String color, int year, int model) {
		super(color, year);
		this.model = model;
	}
	
	public void getCoding() {
		System.out.print("Go coding on mac!!"+ "\n");
	}
	
	public String toString() {
		return super.toString() + " " + " Model " + model;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Macbook apl = (Macbook) o;
		return apl.model == this.model;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(), model);
	}
}
