package lab1;

public class Temperature {
	private double temperature;
	private String scale;
	
	public Temperature(double temperature) {
		this.temperature = temperature;
		scale = "C";
	}
	public Temperature(String scale) {
		this.scale = scale;
		temperature = 0;
	}
	public Temperature (double temperature, String scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	public Temperature() {
		scale = "C";
		temperature = 0;
	}
	
	public double Celsius(double temperature) {
		if (scale == "C") {
			double degreesC = temperature;
			return degreesC;
		}	
		double degreesC = 5*(temperature - 32)/9;
		temperature = degreesC;
		this.scale = "C";
		return degreesC;
	}
	
	public double Fahrenheit(double temperature) {
		if (scale == "F") {
		double degreesF = temperature;
		return degreesF;
		}
		double degreesF = 9*(temperature/5) + 32;
		this.scale = "F";
		temperature = degreesF;
		return degreesF;
	}
	
	public void setValue(double temperature) {
		this.temperature = temperature;
	}
	
	public void setScale(String scale) {
		if (this.scale != scale) {
			if (scale == "C") this.temperature = Celsius(this.temperature);
			else this.temperature = Fahrenheit(this.temperature);
		}
		this.scale = scale;
	}
	
	public void setBoth (double temperature, String scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public String getScale (){
		return this.scale;
	}
	
	public double getTemperature () {
		return this.temperature;
	}
	
	public String toString() {
		String answer = temperature + " " + scale;
		return answer;
	}
	
}
