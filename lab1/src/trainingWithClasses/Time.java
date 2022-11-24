package trainingWithClasses;

public class Time {
	int hour;
	int min;
	public Time() {
		
	}
	public Time(int hour, int min) {
		this.min=min;
		this.hour = hour;
	}
	public String toString() {
		return this.hour+ ":"+this.min;
	}
	public boolean equals(Time b) {//you have to pass Object here, to be discussed later. 
		//this is our basic version
		return this.hour==b.hour && this.min==b.min;
	}
}
