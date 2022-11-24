package problem2;

public class Person implements Runable {
	
	
	public void distance(double speed, double time) {
		System.out.println("Person moves " + speed * time + " distance. With "+ speed+ " speed");
	}

	public void distance(double speed, double time, double acceleration) {
		System.out.println("Person runs " + speed * time + " distance. With "+ speed+ " speed"+ " .Initial acceleration is "+ acceleration + "\n");
	}

}
