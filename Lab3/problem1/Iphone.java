package problem1;
import java.time.LocalDate;

public class Iphone extends Apple {
	Iphone()
	{
		super();
		this.type = "14 Pro";
		this.year = LocalDate.now();
	}

	public Iphone(String name, LocalDate year, String type) {
		super(name, year, type);
	
	}

	@Override
	String textMail() {
		return "You wrote mail from Iphone " + this.type;
	}

	@Override
	String callFriend() {
		return "You call Frinend from Iphone " + this.type;
	}

	
	
	

}

