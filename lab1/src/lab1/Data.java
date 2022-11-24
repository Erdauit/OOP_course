package lab1;

public class Data {
	private double value;
	private double max = 0;
	static private int counter;
	
	public Data () {}
	
	public void setValue(double value) {
		this.value = this.value + value;
		counter++;
		Max(value);
	}

	public double average () {
		double average = value/counter;
		return average;
	}
	
	public double Max (double value) {
		if (this.max == 0) this.max = 0;
		
		if (value > this.max) {
			this.max = value;
		}

		return this.max;
	}
	
	
	public double getMax() {
		return max;
	}
	public double getAverage() {
		return average();
	}
	
	
	public String toString() {
		String answer = "Average = "+ getAverage() +"\n" + "Maximum = "+ getMax(); 
		return answer;
	}
}
