package problem4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Employee aaa = new Employee("Aaaaaaa", "1111111", date, 100000);
		Employee a = new Employee("Erdauit", "1111111", date, 50000);
		Employee b = new Employee("Alima", "2222222", date, 100000);	
		Manager c = new Manager("Bakosh", "3333333", date, 300000);
		c.setSalary(500000);
		c.addTeammate(b);
		c.setBonus(15000);
		
		
		Vector <Employee> vector = new Vector <Employee>();
		vector.add(a);
		vector.add(b);
		vector.add(aaa);
		Collections.sort(vector, new NameCompare());
		for(Employee i: vector) {
			System.out.println(i.toString());
		}
		
		if(a.compareTo(b) == -1) {
			System.out.println( "b is bigger than a");
		} else if(a.compareTo(b) == 0) {
			System.out.println( "They are equal");
		} else {
			System.out.println( "a is bigger than b");
		}
	}
}

