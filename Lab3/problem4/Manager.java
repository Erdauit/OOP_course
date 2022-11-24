package problem4;

import java.time.LocalDate;
import java.util.Vector;


public class Manager extends Employee{
	private Vector <Employee> team = new Vector <Employee>();
	private double bonus;

	public Manager(String name){
		super(name);
	}

	public Manager(String name, String insuranceNumber){
		super(name, insuranceNumber);
	}

	public Manager(String name, String insuranceNumber, LocalDate hireDate) {
		super(name, insuranceNumber, hireDate);
	}

	public Manager(String name, String insuranceNumber, LocalDate hireDate, double salary) {
		super(name, insuranceNumber, hireDate, salary);
	}

	public Manager(String name, String insuranceNumber, LocalDate hireDate, double salary, double bonus) {
		this(name, insuranceNumber, hireDate, salary);
		setBonus(bonus);
	}

	public double getBonus(){
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Vector <Employee> getTeam(){
		return team;
	}

	public void addTeammate(Employee e) {
		team.add(e);
	}

	public void addTeam(Vector <Employee> vec) {
		team.addAll(vec);
	}

	public int compareTo(Employee e) {
		if(super.compareTo(e) != 0) return super.compareTo(e);
		Manager e1 = (Manager)e;
		if(bonus > e1.bonus) return 1;
	
		if(bonus < e1.bonus) return -1;
		return 0;
	}

	@SuppressWarnings("unchecked")
	public Object clone() throws CloneNotSupportedException {
		Manager m = (Manager) super.clone();
		m.team = (Vector<Employee>)team.clone();
		return m;
	}

	public String toString() {
		String output = super.toString();
		output = output.replace("|EMPLOYEE|", "|MANAGER|");
		output = output + ", teammates: " + team.toString() + ", bonus: " + bonus;
		return output;
	}
}
