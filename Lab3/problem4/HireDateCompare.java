package problem4;

import java.util.Comparator;

public class HireDateCompare implements Comparator <Employee> {
	public int compare(Employee e1, Employee e2) 
	{
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
}

