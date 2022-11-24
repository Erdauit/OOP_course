package problem1;
import java.time.LocalDate;

abstract public class Apple {
	protected String name;
	protected LocalDate year;
	protected String type;
	
	Apple()
	{
		this.name = "SE";
		this.year = LocalDate.now();;
		this.type = "Undefined";
	}
	Apple(String name, LocalDate year, String type)
	{
		this.name = name;
		this.year = LocalDate.now();
		this.type = type;
	}
	abstract String textMail();
	abstract String callFriend();
	
	public String getName() {
		return name;
	}
	protected LocalDate getYear() {
		return year;
	}
	protected void setYear(LocalDate year) {
		this.year = year;
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	};
	
}
