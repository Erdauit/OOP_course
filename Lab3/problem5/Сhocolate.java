package problem5;

public class Сhocolate implements Comparable<Сhocolate>{
	private String name;
	private double weight;

	Сhocolate(double weight){
		this.weight = weight;
	}

	Сhocolate(String name, double weight){
		this.weight = weight;
		this.name = name;
	}

	public String toString(){
		return "Name:" + name + "  Weight:" + weight;
	}

	public int compareTo(Сhocolate choco) {
		if(weight > choco.weight) return 1;
		if(weight < choco.weight) return -1;
		return 0;
	}

}
