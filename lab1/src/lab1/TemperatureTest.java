package lab1;

public class TemperatureTest {
	
	public static void main(String[] args) {
		Temperature p2 = new Temperature(29, "С");
		p2.setScale("F");
		System.out.print(p2.toString());
		
	}
	
}
