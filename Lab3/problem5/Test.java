package problem5;

public class Test {

	public static void main(String[] args) {
		
		Сhocolate a = new Сhocolate("AlpenGold", 10);
		Сhocolate b = new Сhocolate("Kitkat", 15);
		Сhocolate c = new Сhocolate("Ritter Sport", 8);
		Сhocolate e = new Сhocolate("Klubnicka v shockolade", 100);
		Сhocolate [] array = new Сhocolate[] {a, b, c, e};

		System.out.println("Array before sorting:");
		for(Сhocolate i: array) {
			System.out.println(i.toString());
		}

		System.out.println("\n");
		System.out.println("Array after sorting:");
		Sort.bubbleSort(array);

		for(Сhocolate i: array) {
			System.out.println(i.toString());
		}

	}

}
