package lab1;
import java.util.*;

public class TestGradeBook {

	public static void main(String[] args) {
		GradeBook book = new GradeBook();
		Scanner scanner = new Scanner(System.in);
		
		Course course = new Course("OOP", "CS101", 6, "PP2");
		System.out.println(book.displayMessage(course));
		
		while (scanner.hasNext()) {

			String name = scanner.next();
			if (name.equals("exit")) break;
			int grade = scanner.nextInt();
			
			
			book.addStudent(name, grade);
		}
		scanner.close();
		
		System.out.println(book.gradeReport());
		book.outputBarChat();
		
	}

}
