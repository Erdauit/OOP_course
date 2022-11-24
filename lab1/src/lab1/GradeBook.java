package lab1;
import practice2.Student;
import java.util.*;

public class GradeBook {
	static public Vector<Student> student= new Vector<Student>();
	private double average = 0;
	private int min = 101, max = -1, cnt = 0, id = 1;
	private int minId, maxId;
	private String maxName;
	private String minName;
	Student maxS;
	Student minS;
	
	Scanner scan = new Scanner(System.in);
	
	public void addStudent(String name, int grade) {
		student.add(new Student(name, grade, id));
		cnt++;
		id++;
	}
	
	public String displayMessage(Course course) {
		String message = "Welcome to grade book for " + course.toString() + "\n";
		return message;
	}
	
	public double determineClassAverage() {
		for (Student curStudent: student) {
			average += curStudent.getScore();
		}
		return average = average/cnt;
	}
	
	public int maximum() {
		for (Student curStudent: student) {
			if (curStudent.getScore() > max) {
				maxS = curStudent;
				
							
				}
		}
		return max;
	}
	
	public int minimum() {
		for (Student curStudent: student) {
			if (curStudent.getScore() < this.min) {
				this.min = curStudent.getScore();
				this.minName = curStudent.getName();
				this.minId = curStudent.getId();
			}
		}
		return min;
	}
	public void outputBarChat() {
		System.out.print("Grades distribution: \n");
		for (int i = 0; i < 100; i+=10) {
			String star ="";
			for (Student curStudent: student) {
				if (curStudent.getScore() >= i && curStudent.getScore() <=i + 9) {
					star += "*";
				}
			}
			System.out.print(i + "-" + (i + 9)+ ":"+ star + "\n");
		}
		String star ="";
		for (Student curStudent: student) {
			if (curStudent.getScore() == 100) {
				star += "*";
			}
		}
		System.out.println(100 + ":" + star);
	}
	
	public String gradeReport() {
		String answer = "Class average is "+ determineClassAverage()+"."+ " Lowest grade is "+ minimum()+"("+minName+" ID "+minId+ ")"+"."+"\n"+ "Highest grade is " + maximum()+"("+maxName+" ID "+maxId+")" + "\n";
		return answer;
	}
	
}
