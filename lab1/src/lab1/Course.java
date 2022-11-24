package lab1;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private String prereq;
	
	public Course (String name, String descrp, int credits) {
		this.name = name;
		this.description = descrp;
		this.numberOfCredits = credits;
		this.prereq = "No prerequisite";
	}
	
	public Course (String name, String descrp, int credits, String prereq) {
		this.name = name;
		this.description = descrp;
		this.numberOfCredits = credits;
		this.prereq = prereq;
	}
	
	public String toString() {
		String ans = description + " " + name + "!" + "\n"+ "Number of credits: "+ numberOfCredits + "\n"+"Prerequisites: " +prereq;
		return ans;
	}
	
}
