package problem1;

public class Plane implements Flyable{

	String name = "Turkish airlines";
	@Override
	public void fly() {
		
		System.out.println(this.name + " fly from Almaty to NY!");
	}

}
