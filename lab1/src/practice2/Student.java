package practice2;

 public class Student {
	public String name;
	public int id;
	public int course;
	public int score;
	public Student (String name, int score, int id) {
		this.name = name;
		this.score = score;
		this.id = id;
	}
	public int getScore () {
		return score;
	}
	public String getName () {
		return this.name;
	}
	
	
	public void setValue (String name, int score) {
		this.name = name;
		this.score = score;
	}
	public void setName (String name ) {
		this.name = name;
	}
	public int getId () {
		return this.id;
	}
	
	int getCourse () {
		return this.course;
	}
	

}
