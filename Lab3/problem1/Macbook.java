package problem1;

import java.time.LocalDate;

public class Macbook extends Apple{

	public Macbook() {
		super();
	}

	public Macbook(String name, LocalDate year, String type) {
		super(name, year, type);
	}

	@Override
	String textMail() {

		return "You wrote mail from Macbook " + this.type;
	}

	@Override
	String callFriend() {
		return "You call Friend from Macbook " + this.type;
	}
	
	
	
	
}
