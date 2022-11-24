package equals;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Person> setters = new HashSet<Person>();
		Person a = new Student("Erda", 18, 2189);
		Person b = new Student("Erda", 18, 2189);
		Person c = new Student("Nurikk", 18, 2180);
		Person d = new Student("Nurikk", 18, 2181);
		Person e = new Student("Alima", 18, 1212);
		
		setters.add(a);
		setters.add(b);
		setters.add(c);
		setters.add(d);
		setters.add(e);
		
		for (Person a1: setters) {
			if (a1 instanceof Student) {
				Student ppp = (Student) a1;
				System.out.println(ppp.toString());
			}
		}
	}

}
