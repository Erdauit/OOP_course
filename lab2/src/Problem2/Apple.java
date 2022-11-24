package Problem2;

import java.util.Objects;

public class Apple {
	int year;
	String color;
	
	public Apple() {
		
	}
	
	public Apple(String color, int year) {
		this.color = color;
		this.year = year;
	}
	
	public String toString() {
		return "Year " + year + "\n Color "+ color +"\n";
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		Apple apl = (Apple) o;
		return year == apl.year && this.color.equals(apl.color);
	}
	
	public int hashCode() {
		return Objects.hash(year, color);
	}
	
}
