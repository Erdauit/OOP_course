package problem4;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	protected double salary;
	protected LocalDate hireDate;
	protected String insuranceNumber;
	{
		hireDate = LocalDate.now();
	}

	public Employee(String name){
		super(name);
	}

	public Employee(String name, String insuranceNumber){
		super(name);
		this.insuranceNumber = insuranceNumber;
	}

	public Employee(String name, String insuranceNumber, LocalDate hireDate) {
		this(name, insuranceNumber);
		this.hireDate = hireDate;
	}

	public Employee(String name, String insuranceNumber, LocalDate hireDate, double salary) {
		this(name, insuranceNumber, hireDate);
		this.salary = salary;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary(){
		return salary;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public boolean equals(Object o) {
		if(!super.equals(o)) 
		{
			return false;
		}
		Employee e = (Employee)o;
		return this.insuranceNumber.equals(e.insuranceNumber) && this.hireDate.equals(e.hireDate) && this.salary == e.salary;
	}

	public int hashCode() {
		return Objects.hash(insuranceNumber);
	}

	public int compareTo(Employee e) {
		if(this.getSalary() > e.getSalary()) return 1;
		else if(this.getSalary() < e.getSalary()) return -1;
		return 0;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber
				+ ", name=" + name + "]";
	}
	
}
