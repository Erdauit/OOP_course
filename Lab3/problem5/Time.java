package problem5;

public class Time implements Comparable <Time> {
	int hour;
	int minute;
	int second;

	Time(int hour, int minute, int second) 
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	static boolean isValid(int hour, int minute, int second)
	{	
		return !(hour > 23 || hour < 0 || minute > 59 || minute < 1 || second > 59 || second < 1);

	}

	String toUniversal()
	{
		if(isValid(hour, minute, second))
		{
			return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
		}
		else
		{
			return "Error!";
		}
	}


	String toStandard()
	{
		if(isValid(hour, minute, second))
		{
			if(hour > 12)
			{
				hour = hour - 12;
				return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + " PM";
			}
			else 
			{
				return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + " AM";
			}
		}
		else
		{
			return "Error!";
		}
	}
	static Time add(Time t1, Time t2) {
		t1.hour += t2.hour;
		t1.minute += t2.minute;
		t1.second += t2.second;

		if(t2.second > 59)
		{
			t1.minute += t2.second/60;
			t1.second = t2.second%60;
		}
		if(t2.minute > 59)
		{
			t1.hour += t2.minute/60;
			t1.minute = t2.minute%60;
		}
		t1.hour = t2.hour % 24;
		return t1;
	}

	void add(Time t2)
	{
		hour += t2.hour;
		minute += t2.minute;
		second += t2.second;

		if(second > 59)
		{
			minute += second/60;
			second = second%60;
		}
		if(minute > 59)
		{
			hour += minute/60;
			minute = minute%60;
		}
		hour = hour % 24;
	}

	public int compareTo(Time t) {
		if(hour > t.hour) {return 1;}
		if(hour < t.hour) {return -1;}
		if(minute > t.minute) {return 1;}
		if(minute < t.minute) {return -1;}
		if(second > t.second) {return 1;}
		if(second < t.second) {return -1;}
		return 0;
	}
}


