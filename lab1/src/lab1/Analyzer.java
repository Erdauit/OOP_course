package lab1;
import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number(Q to quit):");
		
		while (scanner.hasNextDouble()) {
			System.out.print("Enter number(Q to quit):");
			data.setValue(scanner.nextDouble());
		}
		scanner.close();
		System.out.println(data.toString());
	}
}
